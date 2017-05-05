package interfaces.music4;

import walktrough4.polymorphism.music.Note;

/**
 * Created by c0dyy on 1/7/17.
 */
abstract class Instr {
    private int i;
    public abstract  void play(Note n);
    public String what() {return "Instrument"; }
    public abstract  void adjust();
}
