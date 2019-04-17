package State.Ex2;

public enum Produit {

    Carrotte("carrotte",2),Tomate("tomate",3),Poivron("poivron",4),Endives("endive",5), PommeDeTerre("pomme de terre", 6);

    private String nom;
    private int prixAuKilo;

    Produit(String nom, int prixAuKilo) {
        this.nom = nom;
        this.prixAuKilo = prixAuKilo;
    }

    public String getNom() {
        return nom;
    }

    public int getPrixAuKilo() {
        return prixAuKilo;
    }
}
