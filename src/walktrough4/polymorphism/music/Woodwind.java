package walktrough4.polymorphism.music;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play()" + n);
    }
    String what() {return "Wind";}
}
