package PLCObserver.Ex1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Trader implements PropertyChangeListener {

    String nom;
    double fond;
    Action action;
    ArrayList<Action> portefeuille;

    public Trader(String nom, double fond,Action action) {
        this.nom = nom;
        this.fond = fond;
        System.out.println("je me nomme "+nom+", je suis les actions "+action.getNomCompagnie());
        portefeuille = new ArrayList<>();
        this.action = action;
    }

    public void acheterAction(Action action, int n) {
        System.out.println("J'achete "+n+" action "+action.getNomCompagnie());
        int compteur = n;
        do {
            portefeuille.add(action);
            fond -= action.getPrix();
            compteur--;
        } while (compteur != 0);
    }

    public void vendreAction(Action action, int n) {
        System.out.println("Je vend "+n+" action "+action.getNomCompagnie());
        int compteur = n;
        do {
            portefeuille.remove(action);
            fond += action.getPrix();
            compteur--;
        } while (compteur != 0);
    }

    public int aleatoire (int mini ,int maxi){

        int nombreAleatoire = mini + (int)(Math.random() * ((maxi - mini) + 1));
        return nombreAleatoire;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        double taux = (Double)evt.getNewValue();
        System.out.println("Le taux est passé à "+taux);
        if (taux > 0 && taux < 10) {
            acheterAction(action,aleatoire(10,20));
        }
        if (taux >= 10 && taux < 20) {
            acheterAction(action, aleatoire(5, 10));
        }
        if (taux >= 20 && taux < 30) {
            System.out.println("J'attend de voir ...");
        }
        if (taux >= 30 && taux < 40) {
            vendreAction(action, aleatoire(5, 10));
        }
        if (taux >= 40 && taux <50) {
            vendreAction(action, aleatoire(10,20));
        }


    }
}
