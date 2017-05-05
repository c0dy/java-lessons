package interfaces.filters;

/**
 * Created by c0dyy on 1/7/17.
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input) {return input;}
}
