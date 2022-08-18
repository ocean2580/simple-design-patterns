package ocean.structure.combination;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component{   //目录可以包含多个文件或目录

    List<Component> child = new ArrayList<>();   //这里我们使用List来存放目录中的子组件

    @Override
    public void addComponent(Component component) {
        child.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        child.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return child.get(index);
    }

    @Override
    public void test() {
        child.forEach(Component::test);   //将继续调用所有子组件的test方法执行业务
    }
}
