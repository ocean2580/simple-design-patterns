package ocean.builder.prototype.deep;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B(14);
        B bb = (B) b.clone();
        System.out.println(b.getAge() == bb.getAge());
    }
}
