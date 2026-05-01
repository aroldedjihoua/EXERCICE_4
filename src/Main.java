

 // Classe principale pour tester les comptes bancaires

public class Main {

    public static void main(String[] args) {

        // Création d’un compte courant
        CheckingAccount checking = new CheckingAccount("CHK001", 1500, 500);
        checking.setLimit(800);

        // Création d’un compte épargne
        SavingsAccount savings = new SavingsAccount("SVG001", 3000, 3.5);

        // Création d’un certificat de dépôt
        COD cod = new COD("COD001", 10000, 12);

        // Affichage des informations du compte courant
        System.out.println("=== Checking Account ===");
        System.out.println("Account: " + checking.getAccount());
        System.out.println("Balance: " + checking.getBalance());
        System.out.println("Limit: " + checking.getLimit());

        // Affichage des informations du compte épargne
        System.out.println("\n=== Savings Account ===");
        System.out.println("Account: " + savings.getAccount());
        System.out.println("Balance: " + savings.getBalance());
        System.out.println("Interest Rate: " + savings.getInterestRate());

        // Affichage des informations du COD
        System.out.println("\n=== COD Account ===");
        System.out.println("Account: " + cod.getAccount());
        System.out.println("Balance: " + cod.getBalance());
        System.out.println("Duration: " + cod.getDuration() + " months");
    }
}