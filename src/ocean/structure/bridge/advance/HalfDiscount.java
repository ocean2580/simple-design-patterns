package ocean.structure.bridge.advance;

import ocean.structure.bridge.basic.Discount;

public class HalfDiscount implements Discount {
    @Override
    public String getDiscount() {
        return "半价";
    }
}
