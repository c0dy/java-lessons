package concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by c0dyy on 2/28/17.
 */
public class DaemonThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
