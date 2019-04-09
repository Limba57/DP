package Decorateur.Ex1;

public class SandwichSimple implements Sandwich {

    private String pain;
    private String fromage;

    public SandwichSimple() {
        pain = "pain";
        fromage = "fromage";
    }

    @Override
    public String ingredient() {
        return pain+" "+fromage;
    }
}
