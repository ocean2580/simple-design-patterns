package ocean.structure.share;

public class UserService {   //用户服务

    public void service(){
        DBUtil util = DBUtilFactory.getFlyweight();   //通过享元工厂拿到DBUtil对象
        util.selectDB();    //该干嘛干嘛
    }
}

