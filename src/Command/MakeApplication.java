package Command;

public class MakeApplication implements Comand {

    private Application app;

    public MakeApplication(Application app) {
        this.app = app;
    }

    @Override
    public void execut() { // on peut passer les arguments si besoin
        app.make();
    }
}
