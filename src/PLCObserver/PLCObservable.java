package PLCObserver;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PLCObservable {

    private String state = "defaut";
    private PropertyChangeSupport support;

    public PLCObservable() {
        support = new PropertyChangeSupport(this);
    }

    public void addPoperertyChangeListener(PropertyChangeListener pc1) {
        support.addPropertyChangeListener(pc1);
    }

    public void removePropertyChangeListener(PropertyChangeListener pc1) {
        support.removePropertyChangeListener(pc1);
    }

    public void setState(String newState) {
        support.firePropertyChange("news", this.state,newState);
        this.state = newState;
    }
}
