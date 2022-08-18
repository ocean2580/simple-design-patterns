package ocean.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();   //被代理的大冤种
        InvocationHandler handler = new TestProxy(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),    //需要传入被代理的类的类加载器
                subject.getClass().getInterfaces(),    //需要传入被代理的类的接口列表
                handler);    //最后传入我们实现的代理处理逻辑实现类
        proxy.test();    //比如现在我们调用代理类的test方法，那么就会进入到我们上面TestProxy中invoke方法，走我们的代理逻辑
    }

}
