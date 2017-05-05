package walktrough3.inheritance;

import static net.mindview.util.Print.*;

/**
 * Created by codyy on 10/25/2016.
 */
public class Detergent extends Cleanser {
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam() {append(" foam()");}

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Check the base class");
        Cleanser.main(args);
    }
}
