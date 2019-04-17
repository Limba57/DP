package State.Ex2;

import java.util.HashMap;

public abstract  class Etat {

    protected Commande commande;
    protected HashMap<Produit, Integer> copieListe;

    public Etat(Commande commande) {
        this.commande = commande;
    }

    public  void ajouterProduit(Produit produit, int quantité) {

        copieListe = commande.getListeDeCourse();
        copieListe.put(produit, produit.getPrixAuKilo() * quantité);
        commande.setListeDeCourse(copieListe);
    }

    public  void supprimerProduit(Produit produit){
        copieListe = commande.getListeDeCourse();
        for (Produit p : copieListe.keySet()) {
            if (p.equals(produit)) {
                copieListe.remove(p);
            }
        }
        commande.setListeDeCourse(copieListe);
    }

    public void effacerListe() {
        copieListe = commande.getListeDeCourse();
        copieListe.clear();
        commande.setListeDeCourse(copieListe);
    }

    public int calculerTotal() {
        copieListe = commande.getListeDeCourse();
        int total = 0;
        for (Produit p : copieListe.keySet()) {
            total += copieListe.get(p);
        }
        return total;
    }

    public abstract String toString();

    public abstract void etatSuivant();

}
