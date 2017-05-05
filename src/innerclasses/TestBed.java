package innerclasses;

/**
 * Created by c0dyy on 1/7/17.
 */
public class TestBed {
    public void f() {
        System.out.println("f()");
    }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
