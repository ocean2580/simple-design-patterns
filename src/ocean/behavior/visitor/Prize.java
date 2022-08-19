package ocean.behavior.visitor;

public class Prize {   //奖
    String name;   //比赛名称
    String level;    //等级

    public Prize(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }
}

