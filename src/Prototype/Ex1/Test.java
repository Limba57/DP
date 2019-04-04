package Prototype.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Color> arcEnCiel = new ArrayList<>();
        int r;
        int g;
        int b;
        int choix;
        for (int i = 0; i < 2; i++) {


            System.out.println("donner les constantes");
            System.out.println("r :");
            r = sc.nextInt();
            System.out.println("g :");
            g = sc.nextInt();
            System.out.println("b :");
            b = sc.nextInt();

            if (i == 0) {
                arcEnCiel.add(new Color(r, g, b));
                System.out.println("couleur crée");
            }else{
            System.out.println("1 --> instance ");
            System.out.println("2 --> copie");
            choix = sc.nextInt();
            arcEnCiel.add(TubeDeGouache.tubeDeGouache(r,g,b,choix,arcEnCiel.get(0)));
            }
        }
        System.out.println(arcEnCiel);
    }
}
