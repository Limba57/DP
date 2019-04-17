package State.Ex2;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Commande commande = new Commande();

        Scanner sc = new Scanner(System.in);
        int choix;
        Produit produit;
        int quantite;
        boolean sortir = false;

        do {
            do {

                System.out.println("Etat de votre commande :" + commande.getEtat().toString());
                System.out.println("1 --> ajouter un produit");
                System.out.println("2 --> supprimer un produit");
                System.out.println("3 --> effacer la commande");
                System.out.println("4 --> etape suivante");
                System.out.println("5 --> calcul du montant total du panier");
                System.out.println("6 --> quitter");
                choix = sc.nextInt();
            } while (choix < 1 && choix > 6);

            switch (choix) {
                case 1:
                    produit = ChoixProduit.choix();
                    quantite = ChoixProduit.quantite();
                    commande.ajouterProduit(produit, quantite);
                    break;
                case 2:
                    produit = ChoixProduit.choix();
                    commande.supprimerProduit(produit);
                    break;
                case 3:
                    commande.effacerCommande();
                    break;
                case 4:
                    commande.etatSuivant();
                    break;
                case 5:
                    System.out.println(commande.toString());
                    break;
                case 6:
                    sortir = true;
                    break;

            }
        } while (sortir == false);

    }
}
