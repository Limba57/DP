package Strategy;

public class Contexte {

    private Strategy strategy;

    public Contexte(Strategy strategy) {
        this.strategy = strategy;
    }

    public void action() {
        strategy.methodeA();
    }
}
