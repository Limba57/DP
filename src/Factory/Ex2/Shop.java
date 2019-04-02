package Factory.Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {

    public Shop() {

        Scanner sc = new Scanner(System.in);
        int choix = 0;

        System.out.println("Choisissez une pizza : ");
        System.out.println("1 --> pizza 4 fromages");
        System.out.println("2 --> pizza calabraise");
        System.out.println("3 --> pizza 4 saisons");
        System.out.println("4 --> pas faim finalement");

        do {
            System.out.println("votre choix : ");

            try {
                choix = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("recommancez votre saisie");;
            }

        } while (choix <= 0 || choix >= 5);

        if (choix == 4) {
            System.out.println("Ciao !!!");
        } else {
            Pizza pizza = Pizzeria.Pizzeria(choix);
            pizza = preparation(pizza);
            pizza = cuisson(pizza);
            pizza = emballage(pizza);
            System.out.println(pizza.nom);
        }

    }
    public  Pizza preparation(Pizza pizza) {
        pizza.nom += " en preparation ";
        return pizza;
    }

    public Pizza cuisson(Pizza pizza) {
        pizza.nom += " en cuisson ";
        return pizza;
    }

    public  Pizza emballage(Pizza pizza) {
        pizza.nom += " emballée, prette à manger ";
        return pizza;
    }
}
