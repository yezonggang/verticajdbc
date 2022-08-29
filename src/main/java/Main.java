import jdbcDemos.JdbcRunnable;
import jdbcDemos.VerticJdbcPressTest;
import lombok.AllArgsConstructor;
import lombok.Data;
import utils.JDBCUtil;
import utils.ThreadPollUtil;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;

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
