package walktrough3.inheritance.reusing;

import static net.mindview.util.Print.*;

/**
 * Created by codyy on 10/25/2016.
 */
public class Soap {
    private String s;
    Soap() {
        print("Soap()");
        s = " Constructed";
    }
    public String toString() {return s;}
}
