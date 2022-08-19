package ocean.behavior.memorandum;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.work("Java Learning");
        System.out.println(student);
        State state = student.save();   // 保存当前活动

        student.work("Soap Opera Watching");
        System.out.println(student);

        student.restore(state); // 回到上一个活动.
        System.out.println(student);


    }
}
