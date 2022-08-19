package ocean.behavior.memorandum;

// 保存对象的状态,会占用大量资源
public class State {
    final String currentWork;
    final int percentage;

    State(String currentWork, int percentage) {   //仅开放给同一个包下的Student类使用
        this.currentWork = currentWork;
        this.percentage = percentage;
    }
}

