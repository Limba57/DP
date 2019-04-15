package PLCObserver;

public class Test {

    public static void main(String[] args) {

        PLCObservable observable = new PLCObservable();

        observable.addPoperertyChangeListener(new PCLObserver(("Obs 1")));
        observable.addPoperertyChangeListener(new PCLObserver(("Obs 2")));

        observable.setState("test state");
        observable.setState("changement");

    }
}
