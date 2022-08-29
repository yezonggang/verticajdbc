/*
package jdbcDemos;
import java.sql.*;
import java.util.Properties;
import com.vertica.jdbc.*;

public class VerticJdbcDemo {
    public static void main(String[] args) {
        // Note: If your application needs to run under Java 5, you need to
        // load the JDBC driver using Class.forName() here.
        Properties myProp = new Properties();
        myProp.put("user", "dbadmin");
        myProp.put("password", "passwd");
        // Set ReadOnly to true initially
        //myProp.put("ReadOnly", "true");
        Connection conn;
        try {
            //DriverManager连接
            conn = DriverManager.getConnection("jdbc:vertica://10.121.198.45:5433/dbadmin",myProp);
            String sql = "insert into yzg(name) values(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            for (int i = 0; i < 20000; i++) {
                ps.setObject(1,"name_"+i);
                //1、"攒"sql
                ps.addBatch();
                if (i%500==0){
                    //2、执行batch
                    ps.executeBatch();
                    //3、清空batch
                    ps.clearParameters();
                }
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/
