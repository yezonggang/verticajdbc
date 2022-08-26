import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.ExecutorService;

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
