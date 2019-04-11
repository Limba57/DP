package Strategy.Ex1;

import Strategy.Strategy;

public class StrategyDefoncer extends StrategyAttaque {

    @Override
    public void attaquerChateau() {
        System.out.println("Il défonce le pont levis et prend le chateau de face !");
    }
}
