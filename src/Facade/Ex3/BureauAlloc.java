package Facade.Ex3;

public class BureauAlloc {

    private Personne client;
    private Archive archive;


    public BureauAlloc(Personne client, Archive archive) {
        this.client = client;
        this.archive = archive;
    }

    public Personne droitAuAlloc() {

        if (client.getNbrEnfants() > 0) {
            System.out.println("droit au alloc ouvert");
            client.setDroitAuAlloc(true);
        } else {
            System.out.println("droit au alloc refusé");
            client.setDroitAuAlloc(false);

        }

        return client;

    }


}
