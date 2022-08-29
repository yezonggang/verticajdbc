import jdbcDemos.VerticJdbcPressTest;
import utils.JDBCUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 线程池大小，实际运行的线程池，表名
        for (int i=1;i<11;i++){
            new VerticJdbcPressTest(10,8,String.format("test%s",i),JDBCUtil.getConnection()).test();
        }

    }
}
