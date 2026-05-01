public class COD extends BankAccount {

    // Durée du dépôt en mois
    private int duration;

    // Constructeur du COD

    public COD(String account, double balance, int duration) {
        super(account, balance);//appel le contructeur du compte balance
        this.duration = duration;//initialisation de la variable duration
    }

    // methode de la qui permet de retourner la duration
    public int getDuration() {
        return duration;
    }

    // methode quinpermet  de saise la durée
    public void setDuration(int duration) {
        this.duration = duration;
    }
}