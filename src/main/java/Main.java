import jdbcDemos.VerticJdbcPressTest;
import utils.JDBCUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // 线程池大小，实际运行的线程池，表名
        Connection conn1 = JDBCUtil.getConnection();
        Connection conn2 = JDBCUtil.getConnection();

        VerticJdbcPressTest verticJdbcPressTest001 = new VerticJdbcPressTest(10,8,"test2",conn1);
        VerticJdbcPressTest verticJdbcPressTest002 = new VerticJdbcPressTest(10,8,"test3",conn2);
        verticJdbcPressTest001.test();
        verticJdbcPressTest002.test();


    }
}
