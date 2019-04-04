package AbstractFactory.Ex3;

public class Fabrique {

    public static Shape fabrique(int dimention, int forme) {

        FabriqueAbstraite fabrique;

        if (dimention == 2) {
            fabrique = new FabriqueDeuxD();
        } else {
            fabrique = new FabriqueTroisD();
        }

        Shape shape;

        shape = fabrique.getShape(forme);

        return shape;

    }
}
