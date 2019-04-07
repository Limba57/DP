package Builder.ExempleBuilder;

public class Directeur {

    /**
     * Construit un objet en appelant les methodes d'un monteur
     */

    private Monteur monteur;

    Directeur(Monteur pMonteur) {
        monteur = pMonteur;
    }

    /**
     * Crée un objet
     * Appellle les methodes de creation
     * des parties du monteur
     */

    public ObjetComplexe creeObjet() {
        monteur.creeObjet();

        monteur.creerAttribut1("libellé de l'objet");
        monteur.creerAttribut2(12);

        return monteur.getObjet();
    }
}
