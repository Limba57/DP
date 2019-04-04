package AbstractFactory.Ex1;

public class FourProvider {

    public static Four getFour(int choix) {
        switch (choix) {
            case 1:
                return new FourAFromage();
            case 2:
                return new FourARomaine();
            default:
                return null;
        }
    }
}
