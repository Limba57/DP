package AbstractFactory.Ex3;

public class FabriqueDeuxD extends FabriqueAbstraite{



    public Shape getShape(int forme) {
        Shape shape;
        switch (forme) {
            case 4:
                shape = new Carre();
                return shape;
            case 3:
                shape = new Triangle();
                return shape;
            default:
                return null;
        }

    }
}
