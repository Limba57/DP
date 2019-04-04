package AbstractFactory.Ex2;

public abstract class Animal {

    String nom;
    String cri;

    public String crier() {
        return nom+" fait "+cri;
    }
}
