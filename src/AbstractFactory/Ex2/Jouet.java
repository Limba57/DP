package AbstractFactory.Ex2;

public abstract class Jouet {
    String nom;
    String bruit;
    public String faireDuBruit() {
        return nom+"fait comme bruit "+bruit;
    }
}
