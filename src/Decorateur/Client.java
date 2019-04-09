package Decorateur;

public class Client {

    public static void main(String[] args) {

        Window simpleWindow = new SimpleWindow();
        System.out.println(simpleWindow.description());

        // avec une scroll barre
        Window scrollbarWindow = new ScrollBarDecorator(simpleWindow);
        System.out.println(scrollbarWindow.description());

        // la total
        Window customWindow = new ScrollBarDecorator(new BorderDecorator(new SimpleWindow()));
        System.out.println(customWindow.description());
    }
}
