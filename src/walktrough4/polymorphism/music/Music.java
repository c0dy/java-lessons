package walktrough4.polymorphism.music;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Music {
public static void tune(Instr i) {
    i.play(Note.MIDDLE_C);
}

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
