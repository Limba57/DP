package Factory.Ex2;

public class Pizzeria {

    public static Pizza Pizzeria(int choix) {
        switch (choix) {
            case 1:
                return new PizzaQuatreFromage();
            case 2:
                return new PizzaCalabraise();
            case 3:
                return new PizzaQuatreSaisons();
            default:
                return null;
        }
    }


}
