package connect;

public class Main {
    public static void main(String[] args) {
        // 线程池大小，实际运行的线程池，表名
        VerticJdbcPressTest verticJdbcPressTest001 = new VerticJdbcPressTest(20,10,"test2");
        VerticJdbcPressTest verticJdbcPressTest002 = new VerticJdbcPressTest(20,10,"test3");
        verticJdbcPressTest001.test();
        verticJdbcPressTest002.test();
    }


}
