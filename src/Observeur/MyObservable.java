package Observeur;

import java.util.ArrayList;
import java.util.List;

public class MyObservable {

    private List<MyObserver> observers = new ArrayList<>();
    private String state;

    public MyObservable(String s) {
        this.state = s;
    }

    public void add(MyObserver observer) {
        observers.add(observer);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        updateObservers();
    }

    private void updateObservers() {
        for (MyObserver obs : observers) {
            obs.update();
        }
    }
}
