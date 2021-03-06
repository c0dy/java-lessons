package concurrency.generator;

import concurrency.EvenChecker;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by c0dyy on 3/1/17.
 */
public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue = new AtomicInteger(0);

    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
