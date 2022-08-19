package ocean.behavior.command.entity;

import ocean.behavior.command.base.Receiver;

public class TV implements Receiver {
    @Override
    public void action() {
        System.out.println("TV now is opening.");
    }
}
