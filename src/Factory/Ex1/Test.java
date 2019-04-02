package Factory.Ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choix ;
        Animal animal;

        System.out.println("Quel animal choisissez vous?");
        System.out.println("1 -- chien");
        System.out.println("2 -- chat");
        System.out.println("3 -- oiseau");
        choix = sc.nextInt();
        animal = Animalerie.animalerie(choix);
        System.out.println(animal.crier());


    }
}
