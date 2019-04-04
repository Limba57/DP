package Prototype;

public abstract class Prototype implements Cloneable {

    protected String name;
    protected MonEntier entier;

    public Prototype(String name,MonEntier entier) {
        this.name = name;
        this.entier = entier;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
            return null;
        }
    }

    public abstract void methodePrto();
}
