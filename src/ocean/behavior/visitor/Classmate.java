package ocean.behavior.visitor;

public class Classmate implements Visitor{   //你的同学也可以作为一个访问者
    @Override
    public void visit(Prize prize) {   //你的同学也关心你得了什么奖，不过是因为你是他的奖学金竞争对手，他其实并不希望你得奖
        System.out.println("你得了"+prize.name+"奖啊，还可以");
        System.out.println("不过这个奖没什么含金量，下次别去了");
    }
}

