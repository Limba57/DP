package State;

public class ConcreteState1 extends State{

    @Override
    public void printStatus(Contexte contexte) {
        System.out.println("Contexte changement d'etat : Etat 1");
        contexte.setState(this);
    }

    @Override
    public String toString() {
        return "Status : 1";
    }
}
