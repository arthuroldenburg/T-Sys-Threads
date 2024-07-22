import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelLogProcessor {
    public ParallelLogProcessor(String word, String file) {
        try{
            ExecutorService executor = new ThreadPoolExecutor(1, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
            Future<Integer> future = executor.submit(new LogProcessor(word, file));
            System.out.println(future.get());
            executor.shutdown();
        }catch (ExecutionException | InterruptedException e){
            e.printStackTrace();
        }

    }
}

