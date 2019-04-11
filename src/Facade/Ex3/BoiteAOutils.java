package Facade.Ex3;

import java.util.Scanner;

public class BoiteAOutils {

    public static boolean question (String question){

        Scanner sc = new Scanner(System.in);
        char reponse;

        do{
            System.out.println(question+" (o/n) :");
            try {
                reponse = sc.nextLine().charAt(0);
            }catch (Exception e){
                reponse = 'u';
            }

        }while (reponse != 'o' && reponse != 'n');

        if (reponse == 'o')
            return true;
        else
            return false;


    }

}
