package Facade.Ex1;

public class ZooKeeper {

    Loup loup;
    Lion lion;
    Girafe girafe;
    Arthur arthur;

    public ZooKeeper() {
        loup = new Loup();
        lion = new Lion();
        girafe = new Girafe();
        arthur = new Arthur();
    }

    public void nourrirLoup() {
        System.out.println(loup.nourrir());
    }

    public void nourrirLion() {
        System.out.println(lion.nourrir());
    }

    public void nourrirGirafe() {
        System.out.println(girafe.nourrir());
    }

    public void nourirArthur() {
        System.out.println(arthur.nourrir());
    }

    public void lesNourrirTous() {
        nourrirLoup();
        nourrirLion();
        nourrirGirafe();
        nourirArthur();
    }
}
