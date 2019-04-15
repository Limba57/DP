package Command;

public class SellApplication implements Comand {

    private Application app;

    public SellApplication(Application app) {
        this.app = app;
    }

    @Override
    public void execut() { // on peut passer les arguments si besoin
        app.sell();
    }


}
