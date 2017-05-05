package interfaces.filters;

/**
 * Created by c0dyy on 1/7/17.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) {this.cutoff = cutoff;}
    public Waveform process(Waveform input) {
        return input;
    }
}
