package Decorateur.Ex2;

public class VoitureAmericaine extends Voiture {

    public VoitureAmericaine(String nom, int anneeDeFarication, int prixDeBase) {
        super(nom, anneeDeFarication, prixDeBase);
        this.norme = Norme.Americaine;
    }
}
