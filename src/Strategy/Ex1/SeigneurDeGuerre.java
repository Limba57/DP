package Strategy.Ex1;

public class SeigneurDeGuerre {

    private String nom;
    private Temps temps;
    private StrategyAttaque strategyAttaque;

    public SeigneurDeGuerre(String nom, Temps temps) {
        this.nom = nom;
        this.temps = temps;
    }

    public void attaquerChateau() {

        switch (temps) {
            case brouillard:
                strategyAttaque = new StrategyEscalade();
                break;
            case chaud:
                strategyAttaque = new StrategySiege();
                break;
            case beau:
                strategyAttaque = new StrategyDefoncer();
                break;
            case moche:
                strategyAttaque = new StrategyBackInTime();
                break;
        }

        strategyAttaque.attaquerChateau();

    }

    public void setTemps(Temps temps) {
        this.temps = temps;
    }
}
