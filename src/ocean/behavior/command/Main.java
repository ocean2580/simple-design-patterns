package ocean.behavior.command;

import ocean.behavior.command.entity.AC;
import ocean.behavior.command.entity.OpenCommand;
import ocean.behavior.command.entity.TV;

public class Main {
    public static void main(String[] args) {
        AC ac = new AC();
        Controller.call(new OpenCommand(ac));

        TV tv = new TV();
        Controller.call(new OpenCommand(tv));
    }
}
