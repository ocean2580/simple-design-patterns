package ocean.structure.bridge.advance;

import ocean.structure.bridge.basic.AbstractTea;
import ocean.structure.bridge.basic.Discount;
import ocean.structure.bridge.basic.Size;

public abstract class RefinedAbstractTea extends AbstractTea {
    protected RefinedAbstractTea(Size size, Discount discount) {
        super(size,discount);
    }

    public String getSize(){   //添加尺寸维度获取方式
        return size.getSize();
    }

    public String getDiscount() {return discount.getDiscount();}
}

