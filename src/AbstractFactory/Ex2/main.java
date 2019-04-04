package AbstractFactory.Ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Que voulez vous ?");
            System.out.println("1--> un chien et son jouet");
            System.out.println("2--> un chat et son jouet");
            System.out.println("3--> un requin et son jouet");
            choix = sc.nextInt();
        } while (choix != 1 && choix != 2 && choix != 3);

        DonneJoujou donneJoujou = Fabrique.fabrique(choix);
        System.out.println(donneJoujou.getAnimal().crier());
        System.out.println(donneJoujou.getJouet().faireDuBruit());
    }
}
