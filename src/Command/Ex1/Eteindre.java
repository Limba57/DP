package Command.Ex1;

public class Eteindre implements Commande{

    Lampe lampe;

    public Eteindre(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.eteindre();
    }
}
