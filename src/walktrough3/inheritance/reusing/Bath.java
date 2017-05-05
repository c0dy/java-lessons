package walktrough3.inheritance.reusing;

import static net.mindview.util.Print.print;

/**
 * Created by codyy on 10/25/2016.
 */
public class Bath {
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        print("In constractor of Bath()");
        s3 = "glad";
        toy = 3.14f;
        castille = new Soap();
    }
    public String toString() {
        if(s4 == null)
            s4 = "glad";
        return
                "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "toy = " + toy + "\n" +
                "castille =" + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }
}
