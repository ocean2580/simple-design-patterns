package ocean.behavior.visitor;

public class Teacher implements Visitor {   //指导老师作为一个访问者
    @Override
    public void visit(Prize prize) {   //它只关心你得了什么奖以及是几等奖，这也关乎老师的荣誉
        System.out.println("你得奖是什么奖？"+prize.name);
        System.out.println("你得了几等奖？"+prize.level);
    }
}
