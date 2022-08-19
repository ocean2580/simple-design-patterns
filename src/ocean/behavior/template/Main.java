package ocean.behavior.template;

public class Main {
    public static void main(String[] args) {
        AbstractDiagnosis diagnosis = new ColdDiagnosis();
        // 部分功能的实现是在子类完成的
        diagnosis.test();
    }
}
