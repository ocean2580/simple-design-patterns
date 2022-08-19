package ocean.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

public class Mediator {   //房产中介
    private final Map<String, User> userMap = new HashMap<>();   //在出售的房子需要存储一下

    public void register(String address, User user){   //出售房屋的人，需要告诉中介他的房屋在哪里
        userMap.put(address, user);
    }

    public User find(String address){   //通过此方法来看看有没有对应的房源
        return userMap.get(address);
    }
}

