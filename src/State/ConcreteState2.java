package State;

public class ConcreteState2 extends State {

    @Override
    public void printStatus(Contexte contexte) {
        System.out.println("Contexte changement d'etat : Etat 2");
        contexte.setState(this);
    }

    @Override
    public String toString() {
        return "Status : 2";
    }
}
