package walktrough4.polymorphism.music;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Wind extends Instr {
    void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
    String what() {return "Wind";}
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
