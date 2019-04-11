package Strategy.Ex1;

public class StrategySiege extends StrategyAttaque {

    @Override
    public void attaquerChateau() {
        System.out.println("Il escalade la muraille coté nord pour prendre les gardes par surprise ");
    }
}
