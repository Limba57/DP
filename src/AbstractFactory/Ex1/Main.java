package AbstractFactory.Ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choix;
        Pizza pizza;
        do {
            System.out.println("voulez vous : ");
            System.out.println("1 ---> Pizza au fromage");
            System.out.println("2 ---> Pizza romaine");
            choix = sc.nextInt();
        } while (choix != 1 && choix != 2);

        Four four = FourProvider.getFour(choix);

        do {
            System.out.println("quel version : ");
            System.out.println("1 --> Americaine");
            System.out.println("2 --> Italiene");
            choix = sc.nextInt();
        } while (choix != 1 && choix != 2);

        if (choix == 1) {
            pizza = four.cuireUnePizzaAmericaine();
        } else {
            pizza = four.cuireUnePizzaItalienne();
        }

        System.out.println(pizza.elleEstPrete());
    }
}
