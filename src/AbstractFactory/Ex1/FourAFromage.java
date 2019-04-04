package AbstractFactory.Ex1;

public class FourAFromage implements Four {

    @Override
    public Pizza cuireUnePizzaItalienne() {
        return new FromageItalienne();
    }

    @Override
    public Pizza cuireUnePizzaAmericaine() {
        return new FromageAmericaine();
    }
}
