package State.Ex1;

public class Test {

    public static void main(String[] args) {

        Colis colis = new Colis();
        System.out.println(colis.jeSuis());

        colis.setEtat(new Livraison());
        System.out.println(colis.jeSuis());

        colis.setEtat(new Reçu());
        System.out.println(colis.jeSuis());

    }

}
