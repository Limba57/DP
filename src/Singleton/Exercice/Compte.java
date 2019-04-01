package Singleton.Exercice;

public class Compte {

    private int numeroDeCompte;
    private int solde;
    private int plafond;
    private LogBanque logBanque;

    public Compte( int solde, int plafond) {
        this.numeroDeCompte = aleatoire(10000,20000);
        this.solde = solde;
        this.plafond = plafond;
        this.logBanque = LogBanque.getLogbanque();
    }

    public synchronized boolean Cretrait(int montant) {

        if ((solde - montant) < 0) {

            System.out.println("Impossible, pas assez de sous, il vous reste seulement : " + solde);
            try {


                wait();
                System.out.println("operation débloquée");
                Cretrait(montant);
            }catch (InterruptedException e){
                System.out.println("erreure");
            }

            return false;
        }
        if (montant < plafond) {
            logBanque.ecrireLog("retrait de "+montant);
            this.solde -= montant;
            System.out.println("retrait de "+montant+" reste "+solde);
            return true;

        }  else {

            System.out.println("Votre demande est rejetée, vous demandez un retrait de " + montant + " € et votre plafond de retrait est de " + plafond +" €");
            System.out.println(solde);
            return true;

        }
    }

    public synchronized int Cdepot(int montant) {

        solde += montant;
        logBanque.ecrireLog("depot de "+montant);
        System.out.println("vous venez de deposer "+montant+" €, votre solde s'éleve à "+solde+" €");
        notifyAll();
        return solde;
    }

    // retourne un nombre aleatoire
    public static int aleatoire (int mini ,int maxi){

        int nombreAleatoire = mini + (int)(Math.random() * ((maxi - mini) + 1));
        return nombreAleatoire;
    }

    // getter

    public int getSolde() {
        return solde;
    }

    public LogBanque getLogBanque() {
        return logBanque;
    }
}
