package Prototype;

public class ProtoB extends Prototype {

    public ProtoB(String name ,MonEntier entier) {
        super(name, entier);
    }

    @Override
    public void methodePrto() {
        System.out.println("Proto type B" + name+ " / "+entier);
    }
}
