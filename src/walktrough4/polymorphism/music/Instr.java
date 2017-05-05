package walktrough4.polymorphism.music;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Instr {
    void play(Note n) {
        System.out.println("Instrument.play()");
    }
    String what() {return "Instr";}
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
