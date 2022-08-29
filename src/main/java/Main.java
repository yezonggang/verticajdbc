import jdbcDemos.VerticJdbcPressTest;
import utils.JDBCUtil;

public class Main {
    public static void main(String[] args) {
        // 针对表名做个循环:test1 表，test2表，见表语句在resources中的test.sql，52*65000的大表
        //每个表开1个线程池
        //每个线程池的大小和实际运行的线程数，可以指定，分别是threadPollNum和runningThredPollNum
        //每个表又分别对应一个connection，在vertica上，就是session
        for (int i=1;i<11;i++){
            new VerticJdbcPressTest(10,8,String.format("test%s",i),JDBCUtil.getConnection()).test();
        }

    }
}
