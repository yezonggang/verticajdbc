package connect;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.*;

@Data
@AllArgsConstructor
public class VerticJdbcPressTest {

    public int threadPollNum ;
    public int runningThreadPollNum ;
    public String tableName ;


    public void test() {
        ExecutorService threadPool = ThreadPollUtil.createThreadPoll(threadPollNum);
        TestRunnable testRunnable=new TestRunnable(tableName);

        for (int i=0;i<runningThreadPollNum;i++) {
            threadPool.submit(testRunnable);
        }

    }



}
