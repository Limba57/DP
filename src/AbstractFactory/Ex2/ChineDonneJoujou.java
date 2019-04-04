package AbstractFactory.Ex2;

public class ChineDonneJoujou extends DonneJoujou {

    public ChineDonneJoujou() {
        this.animal = new Chien();
        this.jouet = new Baballe();
    }
}


