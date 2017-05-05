package walktrough4.polymorphism.music;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Percussion extends Instr {
    void play(Note n) {
        System.out.println("Percussion.play()" + n);
    }
    String what() {return "Percussion";}
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
