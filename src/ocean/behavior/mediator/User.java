package ocean.behavior.mediator;

public class User {
    String name;
    String tel;

    public User(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public User find(String address, Mediator mediator){   //找房子的话，需要一个中介和你具体想找的地方
        return mediator.find(address);
    }

    @Override
    public String toString() {
        return name+" (电话："+tel+")";
    }
}
