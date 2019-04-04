package AbstractFactory.Ex2;

public abstract class DonneJoujou {

    protected Animal animal;

    protected Jouet jouet;

    public Animal getAnimal(){
        return animal;
    }

    public Jouet getJouet() {
        return jouet;
    }

}
