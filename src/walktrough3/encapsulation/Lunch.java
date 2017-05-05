package walktrough3.encapsulation;

/**
 * Created by codyy on 10/25/2016.
 */
public class Lunch {
    void testPrivate() {}
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton() {
        Soup2.access().f();
    }
}
