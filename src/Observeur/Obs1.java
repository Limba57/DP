package Observeur;

public class Obs1 extends MyObserver {

    public Obs1(MyObservable observable) {
        this.observable = observable;
        observable.add(this);
    }

    public void update() {
        System.out.println("obs 1 "+this.observable.getState());
    }

}
