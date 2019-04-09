package Decorateur.Ex1;

public abstract class Supplement implements Sandwich{

    protected Sandwich sandwich;

    public Supplement(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
}
