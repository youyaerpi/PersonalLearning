package com.ecjtu.base;

import com.ecjtu.jdbc.JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: xiexiang
 * @create: 2019/07/16 15:58
 */
public class Base {


    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        System.out.println(connection.getClass().getName());
    }
}
