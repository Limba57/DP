package Decorateur.Ex2;

public class VoitureAsiatique extends Voiture {

    public VoitureAsiatique(String nom, int anneeDeFarication, int prixDeBase) {
        super(nom, anneeDeFarication, prixDeBase);
        this.norme = Norme.Asiatique;
    }
}
