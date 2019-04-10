package Facade.Ex1;

public class Lion {
    private String nom;
    private String nourriture;

    public Lion() {
        this.nom = "Lion";
        this.nourriture = "viande";
    }

    public String nourrir() {
        return "Je nourris le " + nom + " il mange de la " + nourriture;
    }
}
