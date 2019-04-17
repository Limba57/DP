package PLCObserver.Ex1;

public class Test {

    public static void main(String[] args) {

        Action coca = new Action("Coca cola", 10, 40);

        Trader Jordan = new Trader("Jordan Belfort", 100000, coca);

        coca.ajoutTrader(Jordan);

        coca.setTaux(5);

        coca.setTaux(15);

        coca.setTaux(25);

        coca.setTaux(35);

        coca.setTaux(45);
    }

}
