package Facade.Ex1;

public class Test {

    public static void main(String[] args) {

        ZooKeeper zooKeeper = new ZooKeeper();

        zooKeeper.nourirArthur();

        zooKeeper.nourrirLion();

        zooKeeper.lesNourrirTous();
    }
}
