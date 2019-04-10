package Adapteur.Ex2;

public class CorvetteFR implements Adaptateur {

    private Corvette corvette;

    private String unite;

    public CorvetteFR(Corvette corvette) {
        this.corvette = corvette;
        unite = "Km/h";
    }

    @Override
    public String jeRoule() {
        return "Je suis " + corvette.name + " je roule à " + corvette.speed * 1.6 + " " + unite;
    }
}