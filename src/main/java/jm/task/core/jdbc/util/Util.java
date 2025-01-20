package jm.task.core.jdbc.util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final Logger logger = LoggerFactory.getLogger(Util.class);
    private static final String URL = "jdbc:mysql://localhost:3306/tab";
    private static final String USERNAME = "user";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            logger.info("Connection to DB succeeded!");
        } catch (SQLException e) {
            logger.error("Connection failed: {}", e.getMessage());
        }
        return connection;
    }
}
