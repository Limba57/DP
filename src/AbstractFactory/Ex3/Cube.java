package AbstractFactory.Ex3;

public class Cube extends ShapeTroisD {

    public Cube() {
        this.forme = "carre";
    }

    @Override
    public String jeSuisUneForme() {
        return "Je suis un " + forme;
    }
}
