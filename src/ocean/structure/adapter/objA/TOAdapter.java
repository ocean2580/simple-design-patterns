package ocean.structure.adapter.objA;

import ocean.structure.adapter.Target;
import ocean.structure.adapter.TestSupplier;

public class TOAdapter implements Target {   //现在不再继承TestSupplier，仅实现Target

    TestSupplier supplier;

    public TOAdapter(TestSupplier supplier){
        this.supplier = supplier;
    }

    @Override
    public String supply() {
        return supplier.doSupply();
    }
}

