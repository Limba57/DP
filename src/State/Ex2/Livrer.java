package State.Ex2;

import java.util.Scanner;

public class Livrer extends Etat {

    public Livrer(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouterProduit(Produit produit, int quantité) {
        System.out.println("ajout impossible votre commande est livrée");
    }

    @Override
    public void supprimerProduit(Produit produit) {
        System.out.println("suppression impossible votre commande est livrée");
    }

    public void effacerListe() {
        System.out.println("Impossible votre commande est livrée");
    }

    @Override
    public void etatSuivant() {
        Scanner sc = new Scanner(System.in);
        char reponse;

        do {
            System.out.println("Voulez vous faire une nouvelle commande (o/n):");
            reponse = sc.nextLine().charAt(0);
        } while (reponse != 'o' && reponse != 'n');
        if (reponse == 'o') {
            commande.setEtat(new EnCour(commande));
            commande.effacerCommande();
        } else {
            System.out.println("au revoir");
        }
    }

    @Override
    public String toString() {
        return "Commande livrée";
    }
}
