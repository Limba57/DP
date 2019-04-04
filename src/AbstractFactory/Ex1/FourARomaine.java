package AbstractFactory.Ex1;

public class FourARomaine implements Four {

    @Override
    public Pizza cuireUnePizzaItalienne() {
        return new RomaineItalienne();
    }

    @Override
    public Pizza cuireUnePizzaAmericaine() {
        return new RomaineAmericaine();
    }
}
