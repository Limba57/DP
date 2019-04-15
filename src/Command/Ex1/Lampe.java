package Command.Ex1;

public class Lampe {

    private String etat;

    public Lampe() {
        etat = "eteinte";
    }

    public void allumer() {
        etat = "allumée";
        laLampeEst();
    }

    public void eteindre() {
        etat = "eteinte";
        laLampeEst();
    }

    private void laLampeEst() {
        System.out.println("La lampe est : " + etat);
    }

}
