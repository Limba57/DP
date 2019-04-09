package Decorateur;

public abstract class WindowDecorator implements Window {

    // le decoré
    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }
}
