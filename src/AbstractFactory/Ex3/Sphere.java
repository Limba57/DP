package AbstractFactory.Ex3;

public class Sphere extends ShapeTroisD {

    public Sphere() {
        this.forme = "shere";
    }


    @Override
    public String jeSuisUneForme() {
        return "Je suis une "+forme;
    }
}
