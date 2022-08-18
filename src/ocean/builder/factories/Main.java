package ocean.builder.factories;

import ocean.builder.factories.entity.Fruit;
import ocean.builder.factories.factory.AppleFactory;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        test(new AppleFactory()::getFruit);   //比如我们现在要吃一个苹果，那么就直接通过苹果工厂来获取苹果
    }

    //此方法模拟吃掉一个水果
    private static void test(Supplier<Fruit> supplier){
        System.out.println(supplier.get()+" 被吃掉了，真好吃。");
    }
}

