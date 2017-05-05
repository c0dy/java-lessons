package interfaces.music4;

import walktrough4.polymorphism.music.Note;

/**
 * Created by c0dyy on 1/7/17.
 */
public class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }
    public String what() {return "Woodwind";}
}
