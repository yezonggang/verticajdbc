import jdbcDemos.VerticJdbcPressTest;
import utils.JDBCUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // 线程池大小，实际运行的线程池，表名
        Connection conn = JDBCUtil.getConnection();

        VerticJdbcPressTest verticJdbcPressTest001 = new VerticJdbcPressTest(20,10,"test2",conn);
        VerticJdbcPressTest verticJdbcPressTest002 = new VerticJdbcPressTest(20,10,"test3",conn);
        verticJdbcPressTest001.test();
        verticJdbcPressTest002.test();
    }



}
