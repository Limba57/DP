package Adapteur.Ex1;

public class AdaptateurChien implements FaiteDuBruit {

    private Chien chien;

    public AdaptateurChien(Chien chien) {
        this.chien = chien;
    }

    @Override
    public String faireDubruit() {
        return chien.aboyer();
    }

    public Chien getChien() {
        return chien;
    }
}
