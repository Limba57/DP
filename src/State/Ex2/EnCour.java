package State.Ex2;

import java.util.HashMap;

public class EnCour extends Etat {

    public EnCour(Commande commande) {
        super(commande);
    }

    @Override
    public void etatSuivant() {
        commande.setEtat(new Valid(commande));
    }

    @Override
    public String toString() {
        return "commande en cours";
    }
}
