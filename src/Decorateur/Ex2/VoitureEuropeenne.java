package Decorateur.Ex2;

public class VoitureEuropeenne extends Voiture {

    public VoitureEuropeenne(String nom, int anneeDeFarication, int prixDeBase) {
        super(nom, anneeDeFarication, prixDeBase);
        this.norme = Norme.Europeene;
    }
}
