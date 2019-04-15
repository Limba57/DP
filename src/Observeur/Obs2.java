package Observeur;

public class Obs2 extends MyObserver{

    public Obs2(MyObservable observable) {
        this.observable = observable;
        observable.add(this);
    }

    public void update() {
        System.out.println("obs 2 "+this.observable.getState());
    }
}
