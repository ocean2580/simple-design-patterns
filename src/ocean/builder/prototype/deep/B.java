package ocean.builder.prototype.deep;

public class B implements Cloneable {

    private int age;

    public int getAge() {
        return age;
    }

    public B(int age) {
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {   //这里我们改进一下，针对成员变量也进行拷贝
        B b = (B) super.clone();
        b.age = this.age;
        // 补充字段
        return b;   //成员拷贝完成后，再返回
    }

}
