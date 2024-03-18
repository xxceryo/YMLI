package com.example.comment.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCUtils {
    private static final String TAG = "mysql-ymlt-JDBCUtils";

    private static String driver = "com.mysql.jdbc.Driver";// MySql驱动

    private static String dbName = "ymlt";// 数据库名称

    private static String user = "root";// 用户名

    private static String password = "20040404Zxl";// 密码

    private static String ip = "sh-cynosdbmysql-grp-4bgqsul2.sql.tencentcdb.com";
    public static Connection getConn() {

        Connection connection = null;

        try {
            Class.forName(driver);

            connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + ip + ":29116/" + dbName, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }
}

