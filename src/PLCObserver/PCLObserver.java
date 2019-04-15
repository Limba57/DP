package PLCObserver;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLObserver implements PropertyChangeListener {

    private String name;

    public PCLObserver(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(name+" view update : "+evt.getOldValue()+" to "+evt.getNewValue());
    }
}
