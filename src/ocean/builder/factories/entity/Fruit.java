package ocean.builder.factories.entity;

public abstract class Fruit {   //水果抽象类
    private final String name;

    public Fruit(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name+"@"+hashCode();   //打印一下当前水果名称，还有对象的hashCode
    }
}
