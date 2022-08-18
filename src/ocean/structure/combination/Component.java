package ocean.structure.combination;

/**
 * 首先创建一个组件抽象，组件可以包含组件，组件有自己的业务方法
 */
public abstract class Component {
    public abstract void addComponent(Component component);    //添加子组件
    public abstract void removeComponent(Component component);   //删除子组件
    public abstract Component getChild(int index);   //获取子组件
    public abstract void test();   //执行对应的业务方法，比如修改文件名称
}

