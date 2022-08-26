import java.util.concurrent.*;

public class ThreadPollUtil {
    public static ExecutorService createThreadPoll(int threadPoolNum){
        return new ThreadPoolExecutor(
                threadPoolNum,
                20,
                10,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());  //队列满了，尝试去和最早的竞争，也不会抛出异常！
    }
}
