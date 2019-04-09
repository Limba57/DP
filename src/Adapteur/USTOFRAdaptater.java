package Adapteur;

public class USTOFRAdaptater implements FicheFR {

    private FicheUS fiche;

    public USTOFRAdaptater(FicheUS fiche) {
        this.fiche = fiche;
    }

    @Override
    public void fournitElectricité() {
        System.out.println("on utilise un adaptateur US/FR");
        fiche.fournitElectricite();
    }
}
