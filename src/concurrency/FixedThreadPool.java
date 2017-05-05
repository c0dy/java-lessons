package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by c0dyy on 2/28/17.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i = 5; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
