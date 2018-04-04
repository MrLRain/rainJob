package rainJob.com.exercise;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExerciseJDBC {
    public static final String url = "jdbc:mysql://47.93.15.203:3306/rainJob?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "liuyuRain9-i";

    public static Connection conn = null;
    public static PreparedStatement pst = null;
//
//    public static void main(String[] args) {
//        try {
//            Class.forName(name);//指定连接类型
//            conn = DriverManager.getConnection(url, user, password);//获取连接
//            System.out.println("conn = " + conn.getMetaData());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
