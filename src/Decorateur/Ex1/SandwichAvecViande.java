package Decorateur.Ex1;

public class SandwichAvecViande extends Supplement {

    private String viande;

    public SandwichAvecViande(Sandwich sandwich) {
        super(sandwich);
        viande = "steak haché";
    }

    @Override
    public String ingredient() {
        return sandwich.ingredient() + " " + viande;
    }
}
