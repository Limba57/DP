package Strategy;

public class client {

    public static void main(String[] args) {

        Contexte contexte;

        contexte = new Contexte(new ConcreteStrategy1());

        contexte.action();

        contexte = new Contexte(new ConcreteStrategy2());

        contexte.action();

    }
}
