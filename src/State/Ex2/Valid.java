package State.Ex2;

public class Valid extends Etat {

    public Valid(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouterProduit(Produit produit, int quantité) {
        System.out.println("ajout impossible votre commande est validée");
    }

    @Override
    public void supprimerProduit(Produit produit) {
        System.out.println("suppression impossible votre commande est vlaidée");
    }

    @Override
    public void etatSuivant() {
        commande.setEtat(new Livrer(commande));
    }

    @Override
    public String toString() {
        return "Commande validée";
    }
}
