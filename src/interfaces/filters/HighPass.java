package interfaces.filters;

/**
 * Created by c0dyy on 1/7/17.
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff) {this.cutoff = cutoff;}
    public Waveform process(Waveform input) {return input;}
}
