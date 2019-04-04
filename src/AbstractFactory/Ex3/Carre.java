package AbstractFactory.Ex3;

public class Carre extends ShapeDeuxD{

    public Carre() {
        this.forme = "carré";

    }

    @Override
    public String jeSuisUneForme() {

        return "Je suis un " + forme;
    }
}
