package utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {

    public static Connection getConnection() {
        ClassLoader classLoader = JDBCUtil.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataSource datasouce  = null;
        Connection conn = null;
        try {
/*            DruidDataSource dataSource = new DruidDataSource();
            dataSource.setDriverClassName("com.vertica.jdbc.Driver");
            dataSource.setUrl("jdbc:vertica://10.121.198.45:5433/dbadmin");
            dataSource.setUsername("dbadmin");
            dataSource.setPassword("passwd");
            conn = dataSource.getConnection(1000);*/
            datasouce = DruidDataSourceFactory.createDataSource(properties);
            conn = datasouce.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


}
