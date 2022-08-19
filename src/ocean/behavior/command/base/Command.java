package ocean.behavior.command.base;

public abstract class Command {

    private final Receiver receiver;

    protected Command (Receiver receiver) { // 指定接收者
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }

}
