package interfaces.music4;

import walktrough4.polymorphism.music.Note;
/**
 * Created by c0dyy on 1/7/17.
 */
public class Music4 {
   static void tune(Instr i) {
       i.play(Note.MIDDLE_C);
   }
   static void tuneAll(Instr[] e) {
       for(Instr i : e)
           tune(i);
   }

    public static void main(String[] args) {
        Instr[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
