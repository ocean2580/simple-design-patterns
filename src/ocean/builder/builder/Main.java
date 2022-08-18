package ocean.builder.builder;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()   //获取建造者
                .id(1)    //逐步配置各个参数
                .age(18)
                .grade(3)
                .name("小明")
                .awards("ICPC-ACM 区域赛 金牌", "LPL 2022春季赛 冠军")
                .build();   //最后直接建造我们想要的对象
        System.out.println(student.toString());
    }


}
