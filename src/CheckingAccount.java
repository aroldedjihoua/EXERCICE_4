public class CheckingAccount extends BankAccount {

    // Limite de convert authorise
    private double limit;

    //Constructeur du compte courant permet d'actualiser le element du compte courant

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance); // appel du constructeur parent
        this.limit = limit;
    }

    // Limite de convert authorise
    public double getLimit() {
        return limit;
    }

    //  pour Envoyer la limite
    public void setLimit(double limit) {
        this.limit = limit;
    }
}