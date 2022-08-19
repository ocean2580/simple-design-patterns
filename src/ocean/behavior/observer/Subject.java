package ocean.behavior.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    private final Set<Observer> observerSet = new HashSet<>();

    public void observe(Observer observer) {   //添加观察者
        observerSet.add(observer);
    }

    public void modify() {   //模拟对象进行修改
        observerSet.forEach(Observer::update);   //当对象发生修改时，会通知所有的观察者，并进行方法回调
    }
}

