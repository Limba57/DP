package State;

public class Test {

    public static void main(String[] args) {
        Contexte contexte = new Contexte();

        ConcreteState1 cA = new ConcreteState1();
        cA.printStatus(contexte);

        System.out.println(contexte.getState());

        ConcreteState2 cB = new ConcreteState2();
        cB.printStatus(contexte);

        System.out.println(contexte.getState());

    }
}
