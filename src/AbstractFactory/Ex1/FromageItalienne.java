package AbstractFactory.Ex1;

public class FromageItalienne extends Italienne {

    public FromageItalienne() {
        this.nom = "Pizza au fromage version italienne";
    }

    public String elleEstPrete() {
        return nom + " avec dedans :" + pate + fromage + tomate;
    }
}
