package Facade.Ex3;

public class BureauAPL {

    private Personne client;
    private Archive archive;


    public BureauAPL(Personne client, Archive archive) {
        this.client = client;
        this.archive = archive;
    }

    public Personne droitAuAPL() {

        if (client.getSalaire() < (2 * (client.getLoyer()))) {
            System.out.println("droit au APL ouvert");
           client.setDroitAuApl(true);
        } else {
            System.out.println("droit au APL refusé");
            client.setDroitAuApl(false);
        }

        return client;

    }

}
