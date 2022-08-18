package ocean.structure.modification;

import ocean.structure.modification.basic.Base;
import ocean.structure.modification.basic.Decorator;
import ocean.structure.modification.impl.BaseImpl;
import ocean.structure.modification.impl.DecoratorImpl;

// 不改变一个对象本身功能的基础上，给对象添加额外的行为，并且它是通过组合的形式完成的
public class Main {
    public static void main(String[] args) {
        Base base = new BaseImpl();
        Decorator decorator = new DecoratorImpl(base);  //将Base实现装饰一下
        Decorator outer = new DecoratorImpl(decorator);  //装饰者还可以嵌套

        base.test();
        System.out.println("===============================================");
        decorator.test();
        System.out.println("===============================================");
        outer.test();
    }
}
