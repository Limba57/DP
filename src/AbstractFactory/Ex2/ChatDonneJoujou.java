package AbstractFactory.Ex2;

public class ChatDonneJoujou extends DonneJoujou {

    public ChatDonneJoujou() {
        this.animal = new Chat();
        this.jouet = new PelloteDeLaine();
    }
}
