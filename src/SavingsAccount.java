public class SavingsAccount extends BankAccount {

    // Taux d’intérêt du compte épargne
    private double interestRate;

    // Constructeur pour initialiser mle sauvegarde des comptes

    public SavingsAccount(String account, double balance, double interestRate) {
        super(account, balance);
        this.interestRate = interestRate;
    }

    // permetant d'obtenir le taux d'intérêt
    public double getInterestRate() {
        return interestRate;
    }

    // permetant de saisie et envoyer le  taux d'intérêt
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}