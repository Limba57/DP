package Decorateur.Ex2;

public enum Norme {

    Americaine("amériquaine"),Europeene("Européenne"),Asiatique("asiatique");

    String norme;

    Norme(String norme) {

        this.norme = norme;

    }

    public String getNorme() {
        return norme;
    }
}
