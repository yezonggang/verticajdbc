import jdbcDemos.VerticJdbcPressTest;
import utils.JDBCUtil;

public class Main {
    public static void main(String[] args) {
        //针对表名进行循环:test1 表，test2表..........tesnN表，创建表的语句在resources中的test.sql，均是52*65000的大表
        //每个表对应1个线程池，对应1个connection，在vertica上，就是session
        //每个线程池的大小和实际运行的线程数，可以指定，分别是threadPollNum和runningThredPollNum
        //每个connection都是死循环，所以没有close
        for (int i=1;i<21;i++){
            new VerticJdbcPressTest(8,5,String.format("test%s",i),JDBCUtil.getConnection()).test();
        }

    }
}
