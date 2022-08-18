package ocean.structure.combination;

public class File extends Component{   //文件就相当于是树叶，无法再继续添加子组件了

    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException();   //不支持这些操作了
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void test() {
        System.out.println("文件名称修改成功！"+this);   //具体的名称修改操作
    }
}

