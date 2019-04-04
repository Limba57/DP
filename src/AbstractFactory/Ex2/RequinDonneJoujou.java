package AbstractFactory.Ex2;

public class RequinDonneJoujou extends DonneJoujou{

    public RequinDonneJoujou() {
        this.animal = new Requin();
        this.jouet = new Humain();
    }
}
