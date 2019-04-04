package AbstractFactory.Ex1;

public class RomaineItalienne extends Italienne {

    public RomaineItalienne() {
        this.nom = "Pizza romaine version italienne ";
    }

    @Override
    public String elleEstPrete() {
        return nom + " avec dedans :" + pate + fromage + viande + tomate;
    }
}
