package interfaces.music4;

import walktrough4.polymorphism.music.Note;

/**
 * Created by c0dyy on 1/7/17.
 */
public class Stringed extends Instr {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
    public String what() {return "Stringed";}
    public void adjust() {}

}
