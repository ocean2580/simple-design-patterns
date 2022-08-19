package ocean.behavior.memorandum;

import java.util.Random;

public class Student {
    private String currentWork;   //当前正在做的事情
    private int percentage;   //当前的工作完成百分比

    public void work(String currentWork) {
        this.currentWork = currentWork;
        this.percentage = new Random().nextInt(100);
    }

    public State save(){
        return new State(this.currentWork, this.percentage);
    }

    public void restore(State state){
        this.currentWork = state.currentWork;
        this.percentage = state.percentage;
    }

    @Override
    public String toString() {
        return "我现在正在做："+currentWork+" (进度："+percentage+"%)";
    }
}

