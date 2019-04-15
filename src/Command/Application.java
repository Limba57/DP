package Command;

public class Application {

    private String nom;
    private int prix;

    public Application(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void make() {

        System.out.println("Application " + nom + " crée");

    }

    public void sell() {
        System.out.println("Application " + nom + " vendue au client ");
    }
}
