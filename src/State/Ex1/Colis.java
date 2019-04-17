package State.Ex1;

public class Colis {

    private Etat etat;

    public Colis() {
        this.etat = new Commande();
    }

    public String jeSuis() {
        return etat.JeSuis();
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
