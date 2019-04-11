package Facade.Ex3;

public class BureauRecouvrement {

    private Personne client;
    private Archive archive;

    public BureauRecouvrement(Personne client, Archive archive) {
        this.client = client;
        this.archive = archive;
    }

    public boolean presenceDette() {
        if (client.getDette() > 0) {
            System.out.println("Monsieur/Madame "+client.getNom()+" doit "+client.getDette());
            return true;
        }else{
            System.out.println("Pas de dette chez nous.");
            return false;
        }

    }
}
