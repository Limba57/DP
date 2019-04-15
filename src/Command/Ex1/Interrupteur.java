package Command.Ex1;

import java.util.ArrayList;

public class Interrupteur {

    private ArrayList<Commande> listeCommande;

    public Interrupteur() {
        listeCommande = new ArrayList<>();
    }

    public void execute(Commande commande) {
        enregistrement(commande);
        commande.execute();
    }

    public void enregistrement(Commande commande) {
        listeCommande.add(commande);
    }

    public void executeTouteLesActions() {
        for (Commande c : listeCommande) {
            c.execute();
        }
    }

}
