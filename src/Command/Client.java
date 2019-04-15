package Command;

public class Client {
    public static void main(String[] args) {

        Application app = new Application("chat", 1000);

        Dev dev = new Dev();
        dev.receiveCommand(new MakeApplication(app));
        dev.receiveCommand(new SellApplication(app));

    }
}
