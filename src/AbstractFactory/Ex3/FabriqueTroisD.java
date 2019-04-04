package AbstractFactory.Ex3;

public class FabriqueTroisD extends FabriqueAbstraite {

    @Override
    public Shape getShape(int forme) {
        Shape shape;
        switch (forme) {
            case 1:
                shape = new Sphere();
                return shape;
            case 6:
                shape = new Cube();
                return shape;
            default:
                return null;
        }
    }
}
