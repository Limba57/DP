package Adapteur.Ex2;

public class CorvetteFR implements Adaptateur {

    private Corvette corvette;

    public CorvetteFR(Corvette corvette) {
        this.corvette = corvette;
    }

    @Override
    public String jeRoule() {
        this.corvette.unity = "Km/h";
        this.corvette.speed *= 1.6;
        return corvette.jeRoule();
    }
}
