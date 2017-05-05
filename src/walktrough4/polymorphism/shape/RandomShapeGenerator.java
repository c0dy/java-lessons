package walktrough4.polymorphism.shape;

import java.util.Random;

/**
 * Created by c0dyy on 11/29/16.
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shapes next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
