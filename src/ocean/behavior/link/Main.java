package ocean.behavior.link;

public class Main {
    public static void main(String[] args) {
        Handler handler = new FirstHandler();  //一面首当其冲
        handler
                .connect(new SecondHandler())   //继续连接二面和三面
                .connect(new ThirdHandler());
        handler.handle();   //开始面试(连续三面)
    }

}
