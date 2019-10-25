package com.ecjtu.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author xiexiang
 * @date 2019/8/12 7:42 PM
 */
public class JdbcUtil {
    private static Logger logger = Logger.getLogger(JdbcUtil.class.getName());

    private static String url = null;
    private static String userName = null;
    private static String password;

    static {

        try {
            Properties prop = new Properties();
            InputStream inputStream = JdbcUtil.class.getResourceAsStream("/jdbc.properties");
            prop.load(inputStream);
            url = prop.getProperty("url");
            userName = prop.getProperty("userName");
            password = prop.getProperty("password");
            String driverClassName = prop.getProperty("driverClassName");
            //注册驱动,原理:Class.forName会实例化一个类，实例化一个类的时候会执行其静态代码块
            //将对应的Driver注册到DriverManager的CopyOnWriteArrayList集合中
            Class.forName(driverClassName);
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        }
    }


    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url, userName, password);
    }




}
