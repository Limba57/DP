package State.Ex2;

import java.util.HashMap;

public class Commande {

    private Etat etat;
    private int prixTotal;
    private HashMap<Produit, Integer> listeDeCourse;

    public Commande() {
        etat = new EnCour(this);
        prixTotal = 0;
        listeDeCourse = new HashMap<>();
    }

    public void ajouterProduit(Produit produit, int quantite) {
        etat.ajouterProduit(produit,quantite);
    }

    public void supprimerProduit(Produit produit) {
        etat.supprimerProduit(produit);
    }

    public void effacerCommande() {
        etat.effacerListe();
    }

    public void etatSuivant() {
        etat.etatSuivant();
    }

    public int calculerTotal() {
        return etat.calculerTotal();
    }

    public String toString() {
        String s = "Votre commande";
        for (Produit p : listeDeCourse.keySet()) {
            s += "\n" + p.getNom() + " prix unitaire " + p.getPrixAuKilo() + "\nvous en avez commandé pour " + listeDeCourse.get(p);
        }
        s += "\nPrix total = " + calculerTotal();
        return s;
    }




    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public int getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(int prixTotal) {
        this.prixTotal = prixTotal;
    }

    public HashMap<Produit, Integer> getListeDeCourse() {
        return listeDeCourse;
    }

    public void setListeDeCourse(HashMap<Produit, Integer> listeDeCourse) {
        this.listeDeCourse = listeDeCourse;
    }
}
