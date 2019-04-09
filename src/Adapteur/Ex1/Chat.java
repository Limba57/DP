package Adapteur.Ex1;

public class Chat {

    private String nom;

    public Chat(String nom) {
        this.nom = nom;
    }

    public String miauler() {
        return "miaou";
    }

    public String getNom() {
        return nom;
    }
}
