package walktrough4.polymorphism.music;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Stringed extends Instr {
    void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }
    String what() {return "Stringed";}
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
