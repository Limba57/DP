package Prototype.Ex1;

public class TubeDeGouache {

    public static Color tubeDeGouache(int r, int g, int b, int choix, Color clone) {

        Color color;

        switch (choix) {
            case 1:
                color = new Color(r, g, b);
                return color;
            case 2:
                color = clone.clone();
                color.setR(r);
                color.setG(g);
                color.setB(b);
                return color;
            default:
                return null;
        }


    }
}
