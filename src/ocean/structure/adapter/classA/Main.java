package ocean.structure.adapter.classA;

import ocean.structure.adapter.Target;

public class Main {

    public static void main(String[] args) {
        TCAdapter adapter = new TCAdapter();
        test(adapter);
    }

    public static void test(Target target){
        System.out.println("成功得到："+target.supply());
    }

}
