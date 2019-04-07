package Builder.ExempleBuilder;


/**
 * Implemente les methodes permettant de creer des objets complexe
 */
public class ConcreteMonteurA extends Monteur{


    /**
     * Methode de creation de l'attribut attrubut1
     * Precise que l'attribut2 represente une dimention en centimetres
     */

    public void creerAttribut1(String pAttribut1) {

        produit.setAttribut1(pAttribut1 + " (avec dimention en centimetre)");

    }

    /**
     * Methode de creation de l'attribut attribut2
     * Stocke la valeur dans un Float sans modification
     */
    public void creerAttribut2(double pAttrubut2) {
        produit.setAttribut2(new Float(pAttrubut2));

    }

}
