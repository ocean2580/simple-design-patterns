package ocean.behavior.visitor;

public class Family implements Visitor{    //你的家人也可以是一个访问者
    @Override
    public void visit(Prize prize) {   //你的家人并不是最关心你得了什么奖，而是先关心你自己然后才是奖项，他们才是真正希望你好的人。这个世界很残酷，可能你会被欺负得遍体鳞伤，可能你会觉得活着如此艰难，但是你的背后至少还有爱你的人，为了他们，怎能就此驻足。
        System.out.println("孩子，辛苦了，有没有好好照顾自己啊");
        System.out.println("你得了什么奖啊？"+prize.name+"，很不错，要继续加油啊！");
    }
}

