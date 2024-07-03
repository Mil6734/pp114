package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/db114";
    private static final String USER = "root";
    private static final String PASSWORD = "root67";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Соединение с БД выполнено");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL");
        }
        return conn;
    }
}
