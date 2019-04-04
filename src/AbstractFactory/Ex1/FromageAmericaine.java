package AbstractFactory.Ex1;

public class FromageAmericaine extends Americaine {

    public FromageAmericaine() {
        this.nom = "pizza au fromage americaine";
    }

    @Override
    public String elleEstPrete() {
        return nom + " avec dedans :" + pate + fromage + tomate;
    }
}
