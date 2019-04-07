package Builder.ExempleBuilder;

public class ObjetComplexe {

    /*
    objet complexe prit pour l'exemple
     */

    private String attribut1;
    private Number attribut2;

    public void setAttribut1(String attribut1) {
        this.attribut1 = attribut1;
    }

    public void setAttribut2(Number attribut2) {
        this.attribut2 = attribut2;
    }

    public void afficher() {
        System.out.println("Objet complexe : ");
        System.out.println("\t- attribut1 : " + attribut1);
        System.out.println("\t- attribut2 : " + attribut2);
        System.out.println("\t- classe de l'attribut 2 : " + attribut2.getClass());
    }
}
