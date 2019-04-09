package Decorateur.Ex2;

public abstract class Option implements TasDeFeraille {

    protected TasDeFeraille voiture;
    protected String nom;
    protected int prix;

    public Option(TasDeFeraille voiture, String nom, int prix) {
        this.voiture = voiture;
        this.nom = nom;
        this.prix = prix;
        //ajoutOption();
    }

   /* public Voiture ajoutOption() {
        // a finir
        voiture.listeOption.add(this);
        return voiture;
    }*/

    @Override
    public String jeSuis() {
        return voiture.jeSuis()+"\nOption : "+nom+"\ncout de l'option : "+prix+"\nPrix Total : "+this.jeCoute();
    }

    @Override
    public int jeCoute() {
        return voiture.jeCoute()+prix;
    }
}
