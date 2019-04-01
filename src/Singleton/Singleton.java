package Singleton;

public class Singleton {

    // le nom singleton n'est pas obligatoire pour le nom de la classe
    private static Singleton instance = new Singleton();
    // private static Singleton instance = null;                         --> autre methode

    //constructeur privé
    private Singleton() {

    }

    // methode permettant de recuperer l'instance unique
    public static Singleton getInstance() {

      /*  if (instance == null) {                                        --> suite de la deuxieme methode
            instance = new Singleton();
        }*/

        return instance;
    }
}
