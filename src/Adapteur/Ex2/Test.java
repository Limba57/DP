package Adapteur.Ex2;

public class Test {

    public static void main(String[] args) {

        Corvette corvette = new Corvette();

        System.out.println(corvette.jeRoule());

        CorvetteFR corvetteFR = new CorvetteFR(corvette);

        System.out.println(corvetteFR.jeRoule());

    }
}
