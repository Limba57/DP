package Prototype;

public class ProtoA extends Prototype {

    public ProtoA(String name, MonEntier entier) {
        super(name,entier);
    }

    public void methodePrto() {
        System.out.println("Proto type A" + name+ " / "+entier);
    }
}
