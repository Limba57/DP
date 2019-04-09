package Adapteur;

public class Test {

    public static void main(String[] args) {
        FicheUS ficheUS = new FicheUSTypeA();
        PriseCourantUS priseUS = new PriseCourantUS();
        priseUS.brancherFiche(ficheUS);

        System.out.println("-------------------");

        ficheUS = new FicheUSTypeA();
        FicheFR adaptateurFR = new USTOFRAdaptater(ficheUS);
        PriseCourantFR priseFR = new PriseCourantFR();
        priseFR.brancherFiche(adaptateurFR);
    }
}
