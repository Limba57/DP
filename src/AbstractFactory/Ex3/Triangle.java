package AbstractFactory.Ex3;

public class Triangle extends ShapeDeuxD{

    public Triangle() {
        this.forme = "triangle";
    }





    @Override
    public String jeSuisUneForme() {

        return "Je suis un " + forme;
    }
}
