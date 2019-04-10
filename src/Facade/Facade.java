package Facade;

public class Facade {

    ClasseA classeA;
    ClasseB classeB;
    ClasseC classeC;

    public Facade() {
        this.classeA = new ClasseA();
        this.classeB = new ClasseB();
        this.classeC = new ClasseC();

    }

    public void methode1() {
        classeA.methodeA();
        classeB.methodeB();
    }

    public void methode2() {
        classeC.methodeC();
        classeA.methodeA();
    }

}
