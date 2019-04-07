package Builder.ExempleBuilder;
/*
interface permettant de creer les differnetes partie de l'objet complexe
 */
public abstract class Monteur {

    protected ObjetComplexe produit;

    /**
     * Cree un nouveau produit; aucune des parties n'est crée à ce moment là
     */

    public void creeObjet() {
        produit = new ObjetComplexe();
    }

    /**
     * retourne l'objet une fois fini
     */

    public ObjetComplexe getObjet() {
        return produit;
    }

    // methode de création des parties

    public abstract void creerAttribut1(String pAttribut1);
    public abstract void creerAttribut2(double pAttribut2);

}
