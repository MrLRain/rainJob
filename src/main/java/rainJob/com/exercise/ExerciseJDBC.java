package rainJob.com.exercise;


import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.internal.session.ClientSessionImpl;
import com.mongodb.session.ClientSession;
import org.bson.Document;
import org.junit.jupiter.api.Test;

import java.net.UnknownHostException;
import java.sql.*;
import java.util.Collection;
import java.util.Iterator;

public class ExerciseJDBC {
    @Test
    public void testMysql() throws SQLException {
        final String url = "jdbc:mysql://47.93.15.203:3306/rainJob?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        final String name = "com.mysql.jdbc.Driver";
        final String user = "root";
        final String password = "liuyuRain9-i";

        Connection conn = null;
        PreparedStatement pst = null;
        try {
            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url, user, password);//获取连接
            System.out.println("conn = " + conn.getMetaData());
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet tables = metaData.getTables(null, null, null, null);
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println("tableName = " + tableName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
    }

    @Test
    public void testOracle() throws SQLException {
        final String url = "jdbc:oracle:thin:@//118.190.136.80:1521/orcl";
        final String name = "oracle.jdbc.driver.OracleDriver";
        final String user = "faw_vk";
        final String password = "123456";
        Connection conn = null;
        try {
            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url, user, password);//获取连接
            System.out.println("conn = " + conn.getMetaData());
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet columns = metaData.getColumns(null, null, "SYXY_PLANS", null);
            while (columns.next()) {
                Object column = columns.getString("COLUMN_NAME");
                System.out.println("column = " + column);
            }
        /*    ResultSet tables = metaData.getTables(null, null, null, null);
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println("tableName = " + tableName);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }

    }

    @Test
    public void testMongo() {
        final String url = "mongodb://dppf:dppf@47.97.19.73:27017/dppf";
        MongoClientURI mongoClientURI = new MongoClientURI(url);
        String username = mongoClientURI.getUsername();
        char[] password = mongoClientURI.getPassword();
        System.out.println("username = " + username);
        System.out.println("password = " + new String(password));
        String database = mongoClientURI.getDatabase();
        System.out.println("database = " + database);
        MongoClient mongoClient = new MongoClient(mongoClientURI);
        MongoDatabase dppf = mongoClient.getDatabase("dppf");
        MongoIterable<String> collectionNames = dppf.listCollectionNames();
        MongoCursor<String> iterator = collectionNames.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }
        MongoCollection<Document> rain = dppf.getCollection("Rain");
        FindIterable<Document> documents = rain.find();

        MongoCursor<Document> iterator1 = documents.iterator();
        while (iterator1.hasNext()) {
            Document next = iterator1.next();
            System.out.println("next = " + next.toJson());
        }
    }
}