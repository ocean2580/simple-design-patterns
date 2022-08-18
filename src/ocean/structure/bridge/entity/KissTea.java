package ocean.structure.bridge.entity;

import ocean.structure.bridge.advance.RefinedAbstractTea;
import ocean.structure.bridge.basic.Discount;
import ocean.structure.bridge.basic.Size;

// 使得抽象和实现可以沿着各自的维度来进行变化，不再是固定的绑定关系。
public class KissTea extends RefinedAbstractTea {   //创建一个啵啵芋圆奶茶的子类

    protected KissTea(Size size, Discount discount) {   //在构造时需要指定具体的大小实现
        super(size,discount);
    }

    @Override
    public String getType() {
        return "啵啵芋圆奶茶";   //返回奶茶类型
    }
}

