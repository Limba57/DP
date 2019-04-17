package State;

public class Contexte {

    private State state;

    public Contexte() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
