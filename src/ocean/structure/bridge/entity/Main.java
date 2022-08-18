package ocean.structure.bridge.entity;

import ocean.structure.bridge.advance.HalfDiscount;
import ocean.structure.bridge.advance.Large;
import ocean.structure.bridge.entity.KissTea;

public class Main {
    public static void main(String[] args) {
        KissTea tea = new KissTea(new Large(),new HalfDiscount());
        System.out.println(tea.getType());
        System.out.println(tea.getSize());
        System.out.println(tea.getDiscount());
    }

}
