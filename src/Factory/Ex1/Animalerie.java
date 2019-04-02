package Factory.Ex1;

public class Animalerie {

    public static Animal animalerie(int choix) {

        switch (choix) {
            case 1:
                return new Chien();
            case 2:
                return new Chat();
            case 3:
                return new Oiseau();
            default:
                return null;
        }

    }
}
