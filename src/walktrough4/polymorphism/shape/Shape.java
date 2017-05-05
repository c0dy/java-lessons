package walktrough4.polymorphism.shape;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Shape {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shapes[] s = new Shapes[9];
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        for (Shapes shp : s)
            shp.draw();
    }
}
