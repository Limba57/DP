package AbstractFactory.Ex2;

public class Fabrique {

    public static DonneJoujou fabrique(int choix) {
        switch (choix) {
            case 1:
                return new ChineDonneJoujou();
            case 2:
                return new ChatDonneJoujou();
            case 3:
                return new RequinDonneJoujou();
            default:
                return null;
        }
    }
}
