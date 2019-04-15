package Command;

import java.util.ArrayList;
import java.util.List;

public class Dev {

    private List<Comand> comList = new ArrayList<>();

    public void receiveCommand(Comand cmd) {
        comList.add(cmd);
        cmd.execut();
    }
}
