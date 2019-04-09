package Adapteur.Ex1;

public class Chien{

    private String nom;

    public Chien(String nom) {
        this.nom = nom;
    }

    public String aboyer(){
        return "WHOUFF WHOUFF";
    }

    public String getNom() {
        return nom;
    }
}
