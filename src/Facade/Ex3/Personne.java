package Facade.Ex3;

public class Personne {

    private String nom;
    private Double salaire;
    private Double loyer;
    private int nbrEnfants;
    private boolean DroitAuApl;
    private boolean DroitAuAlloc;
    private Double dette;

    public Personne(CerfaAPL cerfaAPL) {

        this.nom = cerfaAPL.getNom();
        this.salaire = cerfaAPL.getSalaire();
        this.loyer = cerfaAPL.getLoyer();
        this.nbrEnfants = 0;
        this.DroitAuApl = false;
        this.DroitAuAlloc = false;
        this.dette=0d;
    }

    public Personne(CerfaAlloc cerfaAlloc) {
        this.nom = cerfaAlloc.getNom();
        this.salaire = 0d;
        this.loyer = 0d;
        this.nbrEnfants = cerfaAlloc.getNbrEnfants();
        this.DroitAuApl = false;
        this.DroitAuAlloc = false;
        this.dette=0d;
    }

    public String getNom() {
        return nom;
    }

    public Double getSalaire() {
        return salaire;
    }

    public Double getLoyer() {
        return loyer;
    }

    public int getNbrEnfants() {
        return nbrEnfants;
    }

    public boolean isDroitAuApl() {
        return DroitAuApl;
    }

    public boolean isDroitAuAlloc() {
        return DroitAuAlloc;
    }

    public Double getDette() {
        return dette;
    }

    public void setDroitAuApl(boolean droitAuApl) {
        DroitAuApl = droitAuApl;
    }

    public void setDroitAuAlloc(boolean droitAuAlloc) {
        DroitAuAlloc = droitAuAlloc;
    }
}
