package Facade.Ex2;

public class Dessinateur {

    Cercle cercle;
    Cube cube;
    Rectangle rectangle;
    Ligne ligne;
    Triangle triangle;

    public Dessinateur() {
        cercle = new Cercle();
        cube = new Cube();
        rectangle = new Rectangle();
        ligne = new Ligne();
        triangle = new Triangle();
    }

    public void dessinerMaison() {
        System.out.println(cube.draw() + " avec au dessus " + triangle.draw()+ " voila une maison \n");
    }

    public void dessinerVoiture() {
        System.out.println(rectangle.draw() + " avec au dessus " + cube.draw() + "\nen dessous du rectangle " + cercle.draw()+" et " + cercle.draw()+" voila une voiture\n");
    }
}
