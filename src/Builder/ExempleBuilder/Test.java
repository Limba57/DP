package Builder.ExempleBuilder;

public class Test {


    public static void main(String[] args) {

        // Instencie les objets directeur et monteur
        Monteur lMonteurA = new ConcreteMonteurA();
        Directeur lDirecteurA = new Directeur(lMonteurA);

        Monteur lMonteurB = new ConcreteMonteurB();
        Directeur lDirecteurB = new Directeur(lMonteurB);

        // Appel des differentes methodes de creation
        ObjetComplexe lProduitA = lDirecteurA.creeObjet();
        ObjetComplexe lProduitB = lDirecteurB.creeObjet();

        // Demande l'affichage des valeurs de l'objet
        lProduitA.afficher();
        lProduitB.afficher();



    }
}
