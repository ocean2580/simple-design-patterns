package ocean.builder.prototype.shallow;

public class A implements Cloneable{

    @Override
    public Object clone() throws CloneNotSupportedException {   //提升clone方法的访问权限

        return super.clone();
    }
}
