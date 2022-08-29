package jdbcDemos;

import lombok.AllArgsConstructor;
import lombok.Data;
import utils.ThreadPollUtil;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;

/**
 * @author y25958
 */
@Data
@AllArgsConstructor
public class VerticJdbcPressTest {

    public int threadPollNum;
    public int runningThreadPollNum;
    public String tableName;
    public Connection connection;


    public void test() {
        System.out.println(String.format("-----begin to create threadPool for table:%s",tableName));
        ExecutorService threadPool = ThreadPollUtil.createThreadPoll(threadPollNum);
        JdbcRunnable testRunnable = new JdbcRunnable(tableName, connection);

        for (int i = 0; i < runningThreadPollNum; i++) {
            threadPool.submit(testRunnable);
        }

    }


}