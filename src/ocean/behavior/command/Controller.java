package ocean.behavior.command;

import ocean.behavior.command.base.Command;

public class Controller {
    public static void call(Command command) {
        command.execute();
    }
}
