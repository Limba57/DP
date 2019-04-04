package Prototype;

public class Client {

    public static void main(String[] args) {

        MonEntier e1 = new MonEntier(4);
        MonEntier e2 = new MonEntier(22);

        Prototype prototypeA = new ProtoA("original", e1);
        Prototype prototypeB = new ProtoB("original", e2);

        Prototype pAClone = prototypeA.clone();
        Prototype pBClone = prototypeB.clone();
        pAClone.setName("clone");
        pBClone.setName("clone");

        System.out.println("-- originaux et copie ---");
        prototypeA.methodePrto();
        pAClone.methodePrto();
        prototypeB.methodePrto();
        pBClone.methodePrto();

        System.out.println("-- entier change --");
        e2.setMonEntier(9);
        prototypeA.methodePrto();
        pAClone.methodePrto();
        prototypeB.methodePrto();
        pBClone.methodePrto();
    }
}
