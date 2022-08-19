package ocean.behavior.state;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setState(State.NORMAL);
        student.study();

        student.setState(State.LAZY);
        student.study();
    }
}
