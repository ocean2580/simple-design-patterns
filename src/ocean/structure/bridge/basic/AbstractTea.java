package ocean.structure.bridge.basic;

public abstract class AbstractTea {

    protected Size size;   //尺寸作为桥接属性存放在类中
    protected Discount discount;

    protected AbstractTea(Size size,Discount discount) {   //在构造时需要知道尺寸属性
        this.size = size;
        this.discount = discount;
    }

    public abstract String getType();   //具体类型依然是由子类决定
    public abstract String getDiscount();
}
