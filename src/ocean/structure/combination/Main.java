package ocean.structure.combination;

// 递归向下处理当前目录和子目录中所有的文件。
public class Main {
    public static void main(String[] args) {
        Directory outer = new Directory();   //新建一个外层目录
        Directory inner = new Directory();   //新建一个内层目录
        outer.addComponent(inner);
        outer.addComponent(new File());   //在内层目录和外层目录都添加点文件，注意别导错包了
        inner.addComponent(new File());
        inner.addComponent(new File());
        outer.test();    //开始执行文件名称修改操作
    }

}
