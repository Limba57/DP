package Decorateur;

public class BorderDecorator extends WindowDecorator {

    public BorderDecorator(Window window) {
        super(window);
    }

    @Override
    public String description() {
        return window.description() + " des bordures rouge en plus";
    }
}
