package ocean.builder.singleton;

public class Hungry {
    private final static Hungry INSTANCE = new Hungry();   //用于引用全局唯一的单例对象，在一开始就创建好

    private Hungry() {}   //不允许随便new，需要对象直接找getInstance

    public static Hungry getInstance(){   //获取全局唯一的单例对象
        return INSTANCE;
    }
}

