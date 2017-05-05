package interfaces.filters;

/**
 * Created by c0dyy on 1/7/17.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) {return input;}
}
