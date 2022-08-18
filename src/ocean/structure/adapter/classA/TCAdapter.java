package ocean.structure.adapter.classA;

import ocean.structure.adapter.Target;
import ocean.structure.adapter.TestSupplier;

public class TCAdapter extends TestSupplier implements Target {
    @Override
    public String supply() {
        return super.doSupply();
    }
}
