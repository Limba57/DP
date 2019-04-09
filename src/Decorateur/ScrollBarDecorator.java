package Decorateur;

public class ScrollBarDecorator extends WindowDecorator {

    public ScrollBarDecorator(Window window) {
        super(window);

    }

    @Override
    public String description() {
        return window.description()+" ajoute une barre de défilement";
    }

}
