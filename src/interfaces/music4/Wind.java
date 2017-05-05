package interfaces.music4;

import walktrough4.polymorphism.music.Note;

/**
 * Created by c0dyy on 1/7/17.
 */
public class Wind extends Instr {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
    public String what() {return "Wind"; }
    public void adjust() {}
}
