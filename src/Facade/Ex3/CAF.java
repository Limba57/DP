package Facade.Ex3;

import java.util.Scanner;

public class CAF {

    private Archive archive;
    private BureauDesArchives bureauDesArchives;
    private BureauAPL bureauAPL;
    private BureauAlloc bureauAlloc;
    private BureauRecouvrement bureauRecouvrement;
    private Compta compta;
    private Demande demande;
    private Scanner sc;
    private Personne client;

    public CAF() {

        sc = new Scanner(System.in);
        int reponse;
        archive = new Archive();
        bureauDesArchives = new BureauDesArchives(archive);

        do {
            System.out.println("Quelle demande voulez vous faire");
            System.out.println("1 --> demande alloc");
            System.out.println("2 --> demande APL");
            reponse = sc.nextInt();
        } while (reponse != 1 && reponse != 2);

        switch (reponse) {
            case 1:
                demande = new CerfaAlloc();
                break;
            case 2:
                demande = new CerfaAPL();
                break;
            default:
                System.out.println("Erreur ds votre dossier demande a renouveller ulterieurement");
        }

        traitement();

    }

    public void traitement() {

        boolean dette;

        client = bureauDesArchives.verificationArchive(demande);
        bureauRecouvrement = new BureauRecouvrement(client, archive);
        bureauAlloc = new BureauAlloc(client, archive);
        bureauAPL = new BureauAPL(client, archive);
        compta = new Compta(client);

        dette = bureauRecouvrement.presenceDette();

        if (demande instanceof CerfaAlloc) {
            client=bureauAlloc.droitAuAlloc();
        } else client = bureauAPL.droitAuAPL();

        if (dette) {
            compta.demandeDeRecouvrement();
        }

        bureauDesArchives.mAJArchive(client);

    }
}
