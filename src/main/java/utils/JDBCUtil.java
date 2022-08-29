package utils;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            DruidDataSource dataSource = new DruidDataSource();
            dataSource.setDriverClassName("com.vertica.jdbc.Driver");
            dataSource.setUrl("jdbc:vertica://10.121.198.45:5433/dbadmin");
            dataSource.setUsername("dbadmin");
            dataSource.setPassword("passwd");
            conn = dataSource.getConnection(1000);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
