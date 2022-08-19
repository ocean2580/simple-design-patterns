package ocean.behavior.command.entity;

import ocean.behavior.command.base.Receiver;

public class AC implements Receiver {
    @Override
    public void action() {
        System.out.println("AC now is opening.");
    }
}
