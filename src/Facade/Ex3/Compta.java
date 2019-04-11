package Facade.Ex3;

public class Compta {

    private Personne client;

    public Compta(Personne client) {
        this.client = client;
    }

    public void demandeDeRecouvrement() {

        System.out.println("Il faut nous payer monsieur, vous nous devez "+ client.getDette());

    }
}
