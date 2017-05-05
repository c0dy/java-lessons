package walktrough4.polymorphism.music;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play()" + n);
    }
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
