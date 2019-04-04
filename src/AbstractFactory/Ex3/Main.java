package AbstractFactory.Ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choix;
        Shape shape = null;

        do {
            System.out.println("On genere quoi :");
            System.out.println("1 --> un triangle");
            System.out.println("2 --> un carre");
            System.out.println("3 --> un cube");
            System.out.println("4 --> une sphere");
            choix = sc.nextInt();
        } while (choix != 1 && choix != 2 && choix != 3 && choix != 4);

        switch (choix) {
            case 1:
                shape = Fabrique.fabrique(2, 3);
                break;
            case 2:
                shape = Fabrique.fabrique(2, 4);
                break;
            case 3:
                shape = Fabrique.fabrique(3, 6);
                break;
            case 4:
                shape = Fabrique.fabrique(3, 1);
        }
        System.out.println(shape.jeSuisUneForme());
        System.out.println(shape.jeSuisEn());

    }
}
