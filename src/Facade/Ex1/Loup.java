package Facade.Ex1;

public class Loup {

    private String nom;
    private String nourriture;

    public Loup() {
        this.nom = "Loup";
        this.nourriture = "viande";
    }

    public String nourrir() {
        return "Je nourris le " + nom + " il mange de la " + nourriture;
    }
}
