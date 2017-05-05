package generics.containers;

import java.util.Random;

/**
 * Created by c0dyy on 2/19/17.
 */
public class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble() > .5;

    @Override
    public String toString() {
        if(shadow) {
            return "Six more weeks of Winter";
        } else  {
            return "Early Spring";
        }
    }
}
