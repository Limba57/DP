package Singleton;

public class SingletonAvecHolder {

    public SingletonAvecHolder() {
    }

    //le holder
    private static class Holder{
       private final static SingletonAvecHolder instance = new SingletonAvecHolder();
       // final indique qu'on ne peut pas la changer donc static+final = constante
    }

    // methode permettant de recuperer l'instance unique
    public static SingletonAvecHolder getInstance() {

        return Holder.instance;  }
}
