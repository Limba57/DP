package State.Ex2;

import java.util.Scanner;

public class ChoixProduit {

    public static Produit  choix() {

        Scanner sc = new Scanner(System.in);
        int choix = 0;

        do {
            System.out.println("1 --> Carrotte");
            System.out.println("2 --> Tommate");
            System.out.println("3 --> Poivron");
            System.out.println("4 --> Endive");
            System.out.println("5 --> Pomme de terre");
            choix = sc.nextInt();
        } while (choix < 1 && choix > 5);

        switch (choix) {
            case 1:
                return Produit.Carrotte;
            case 2:
                return Produit.Tomate;
            case 3:
                return Produit.Poivron;
            case 4:
                return Produit.Endives;
            case 5:
                return Produit.PommeDeTerre;
            default:
                return null;
        }

    }

    public static int quantite() {
        Scanner sc = new Scanner(System.in);
        int quantite;
        System.out.println("Quelle quantité : ");
        quantite = sc.nextInt();
        return quantite;
    }
}
