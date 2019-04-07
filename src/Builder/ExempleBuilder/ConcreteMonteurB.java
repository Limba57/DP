package Builder.ExempleBuilder;

public class ConcreteMonteurB extends Monteur{

    /**
     * Idem que pour MonteurA
     */

    /**
     * idem mais dimention en pouces
     */
    @Override
    public void creerAttribut1(String pAttribut1) {
        produit.setAttribut1(pAttribut1 + " (avec dimention en pouces");
    }

    /**
     * Stock la valeur ds un double en le convertissant en pouce
     */
    @Override
    public void creerAttribut2(double pAttribut2) {
        produit.setAttribut2(new Double(pAttribut2 * 2.54));
    }
}
