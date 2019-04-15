package Observeur;

public class Test {


    public static void main(String[] args) {


        MyObservable observable = new MyObservable("etat par defaut");

        new Obs1(observable);
        new Obs2(observable);

        observable.setState("etat de test");
        observable.setState("changement d'état");
    }
}
