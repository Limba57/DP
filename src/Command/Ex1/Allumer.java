package Command.Ex1;

public class Allumer implements Commande {

    Lampe lampe;

    public Allumer(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.allumer();
    }
}
