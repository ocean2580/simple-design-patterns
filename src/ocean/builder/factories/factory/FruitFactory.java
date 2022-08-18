package ocean.builder.factories.factory;

import ocean.builder.factories.entity.Fruit;

public abstract class FruitFactory<T extends Fruit> {   //将水果工厂抽象为抽象类，添加泛型T由子类指定水果类型
    public abstract T getFruit();  //不同的水果工厂，通过此方法生产不同的水果
}
