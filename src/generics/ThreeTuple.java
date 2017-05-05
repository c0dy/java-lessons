package generics;

/**
 * Created by c0dyy on 1/17/17.
 */
public class ThreeTuple<A,B,C> extends TwoTuple {
    public final C third;
    public ThreeTuple(A a,B b,C c) {
        super(a, b);
        third = c;
    }
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
