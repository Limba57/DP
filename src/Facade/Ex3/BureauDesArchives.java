package Facade.Ex3;

import java.util.ArrayList;

public class BureauDesArchives {

    Archive archive;
    Personne client;

    public BureauDesArchives(Archive archive) {

        this.archive = archive;

    }



    public Personne verificationArchive(Demande demande) {

        for (Personne p : archive.archive) {
            if (p.getNom().equals(demande.getNom())) {
                client = p;
            }
        }
        if (demande instanceof CerfaAPL) {
            client = new Personne((CerfaAPL) demande);

        } else {
            client = new Personne((CerfaAlloc) demande);
        }
        archive.archive.add(client);

        return client;

    }

    public void mAJArchive(Personne client) {

        for (Personne p : archive.archive) {
            if (p.getNom().equals(client.getNom())) {
                archive.archive.set(archive.archive.indexOf(p), client);
                System.out.println("Dossier mis à jour");
            }
        }
    }



}
