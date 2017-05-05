package walktrough4.polymorphism.music;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Music3 {
    public static void tune(Instr i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instr[] e) {
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
