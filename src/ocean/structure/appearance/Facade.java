package ocean.structure.appearance;

import ocean.structure.appearance.sub.A;
import ocean.structure.appearance.sub.B;
import ocean.structure.appearance.sub.C;

// 门面
public class Facade {
    A a = new A();
    B b = new B();
    C c = new C();

    public void job() {
        a.test();
        b.test();
        c.test();
    }
}
