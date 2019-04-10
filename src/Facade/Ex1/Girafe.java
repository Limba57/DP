package Facade.Ex1;

public class Girafe {
    private String nom;
    private String nourriture;

    public Girafe() {
        this.nom = "Girafe";
        this.nourriture = "feuille";
    }

    public String nourrir() {
        return "Je nourris la " + nom + " il mange des " + nourriture;
    }
}
