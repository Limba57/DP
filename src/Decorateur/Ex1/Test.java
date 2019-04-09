package Decorateur.Ex1;

public class Test {


    public static void main(String[] args) {

        Sandwich sandwich = new SandwichSimple();

        System.out.println(sandwich.ingredient());

        sandwich = new SandwichAvecSauce(sandwich);

        System.out.println(sandwich.ingredient());

        sandwich = new SandwichAvecViande(sandwich);

        System.out.println(sandwich.ingredient());


    }
}
