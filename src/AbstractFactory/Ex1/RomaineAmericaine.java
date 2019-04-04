package AbstractFactory.Ex1;

public class RomaineAmericaine extends Americaine {

    public RomaineAmericaine() {
        this.nom = "Pizza romain version americaine (ça n'existe pas mais bon ...)";
    }

    @Override
    public String elleEstPrete() {
        return nom + " avec dedans :" + viande + pate + fromage + tomate;
    }
}
