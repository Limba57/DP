package PLCObserver.Ex1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Action {

    private String nomCompagnie;
    private double prix;
    private double taux;
    private PropertyChangeSupport support;

    public Action(String nomCompagnie, double prix, double taux) {
        this.nomCompagnie = nomCompagnie;
        this.prix = prix;
        this.taux = taux;
        this.support = new PropertyChangeSupport(this);
    }

    public void ajoutTrader(PropertyChangeListener trader) {
        support.addPropertyChangeListener(trader);
    }

    public void retraitTrader(PropertyChangeListener trader) {
        support.removePropertyChangeListener(trader);
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        support.firePropertyChange("Changement de taux",this.taux,taux);
        this.taux = taux;
    }

    public String getNomCompagnie() {
        return nomCompagnie;
    }
}
