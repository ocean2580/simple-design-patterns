package ocean.structure.share;

public class DBUtilFactory {
    private static final DBUtil UTIL = new DBUtil();   //享元对象被存放在工厂中

    public static DBUtil getFlyweight(){   //获取享元对象
        return UTIL;
    }
}

