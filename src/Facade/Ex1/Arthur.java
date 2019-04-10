package Facade.Ex1;

public class Arthur {
    private String nom;
    private String nourriture;

    public Arthur() {
        this.nom = "Arthur";
        this.nourriture = "n'importe quoi";
    }

    public String nourrir() {
        return "Je nourris " + nom + " il mange " + nourriture;
    }
}
