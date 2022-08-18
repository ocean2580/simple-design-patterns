package ocean.builder.prototype.shallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A();
        A aa = (A) a.clone();
        System.out.println(a == aa);    // false
    }
}
