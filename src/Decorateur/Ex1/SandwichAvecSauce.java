package Decorateur.Ex1;

public class SandwichAvecSauce extends Supplement {

    private String sauce;

    public SandwichAvecSauce(Sandwich sandwich) {
        super(sandwich);
        sauce = "ketchup";
    }

    @Override
    public String ingredient() {
        return sandwich.ingredient()+" "+sauce;
    }
}
