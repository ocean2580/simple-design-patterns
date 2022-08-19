package ocean.behavior.state;

public class Student {

    private State state;   //使用一个成员来存储状态

    public void setState(State state) {
        this.state = state;
    }

    public void study(){
        switch (state) {   //根据不同的状态，学习方法会有不同的结果
            case LAZY:
                System.out.println("只要我不努力，老板就别想过上想要的生活，开摆！");
                break;
            case NORMAL:
                System.out.println("拼搏百天，我要上清华大学！");
                break;
        }
    }
}
