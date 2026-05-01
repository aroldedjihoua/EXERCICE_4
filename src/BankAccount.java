public class BankAccount {

    // Identifiant du compte (ex: numéro de compte bancaire)
    protected String account;

    // Solde actuel du compte (argent disponible)
    protected double balance;

    //Constructeur : permet d'initialiser un compte avec un numéro et un solde
    public BankAccount(String account, double balance) {
        this.account = account;//initialisation de la variable account
        this.balance = balance;//initialisation de la variable balance
    }

    //Retourne le numéro du compte
    public String getAccount() {
        return account;
    }

    //Permet de modifier le numéro du compte

    public void setAccount(String account) {
        this.account = account;
    }

    //Retourne le solde actuel du compte
    public double getBalance() {
        return balance;
    }

  //Modifie le solde du compte
    public void setBalance(double balance) {
        this.balance = balance;
    }
}