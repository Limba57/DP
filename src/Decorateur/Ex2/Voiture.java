package Decorateur.Ex2;

import java.util.ArrayList;

public abstract class Voiture implements TasDeFeraille {

    protected String nom;
    protected int anneeDeFarication;
    protected int prixDeBase;
    protected int prixTotal;
    protected Norme norme;
    protected ArrayList<Option> listeOption;

    protected Voiture(String nom, int anneeDeFarication, int prixDeBase) {
        this.nom = nom;
        this.anneeDeFarication = anneeDeFarication;
        this.prixDeBase = prixDeBase;
        prixTotal = this.prixDeBase;
        listeOption = new ArrayList<>();
    }

    @Override
    public String jeSuis() {
        String s = "\nModele : " + nom + "\nAnnée de fabrication : " + anneeDeFarication + "\nPrix de base : " + prixDeBase + "\nNorme : " + norme.getNorme();
        if (!listeOption.isEmpty()){
            for (Option o : listeOption) {
                s += "\nOptinon : "+o.jeSuis() + "\nPrix : " + o.jeCoute();
                prixTotal += o.jeCoute();
            }
        }
        s += "\nPrix total : " + prixTotal;
        return s;
    }

    @Override
    public int jeCoute() {
        return prixTotal;
    }
}
