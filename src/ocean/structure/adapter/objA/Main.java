package ocean.structure.adapter.objA;

import ocean.structure.adapter.Target;
import ocean.structure.adapter.TestSupplier;
import ocean.structure.adapter.classA.TCAdapter;
import ocean.structure.adapter.objA.TOAdapter;

public class Main {

    public static void main(String[] args) {
        TOAdapter adapter = new TOAdapter(new TestSupplier());
        test(adapter);
    }

    public static void test(Target target){
        System.out.println("成功得到："+target.supply());
    }
}
