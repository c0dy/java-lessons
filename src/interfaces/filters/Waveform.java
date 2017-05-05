package interfaces.filters;

/**
 * Created by c0dyy on 1/7/17.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() {return "Waveform " + id;}
}
