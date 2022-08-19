package ocean.behavior.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.observe(() -> System.out.println("我是一号观察者！"));
        subject.observe(() -> System.out.println("我是二号观察者！"));
        Observer observer = () -> System.out.println("我是三号观察者！");

        subject.observe(observer);
        subject.modify();
    }
}
