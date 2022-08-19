package ocean.behavior.mediator;

// 将多对多简化为一对多
public class Main {
    public static void main(String[] args) {
        User tommy = new User("tommy", "12321");
        User monica = new User("monica", "23432");
        Mediator naya = new Mediator();

        naya.register("tokyo", tommy);
        User seller = monica.find("tokyo", naya);

        if (seller == null) {
            System.out.println("Fail to find the resources that suit you.");
        } else {
            System.out.println("You can get more info from " + seller);
        }
    }
}
