package ocean.behavior.command.entity;

import ocean.behavior.command.base.Command;
import ocean.behavior.command.base.Receiver;

public class OpenCommand extends Command {
    public OpenCommand(Receiver receiver) {
        super(receiver);
    }
}
