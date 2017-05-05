package concurrency.generator;

/**
 * Created by c0dyy on 3/1/17.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public synchronized static int nextSerialNumber() {
        return serialNumber++;
    }
}
