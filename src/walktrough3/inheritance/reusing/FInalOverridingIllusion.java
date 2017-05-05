package walktrough3.inheritance.reusing;

/**
 * Created by codyy on 10/25/2016.
 */
public class FInalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
        WithFinals wf = op2;
    }
}
class WithFinals {
    private final void f() {System.out.println("WithFinals.f()");}
    private final void g() {System.out.println("WithFinals.g()");}
}
class OverridingPrivate extends WithFinals {
    private final void f() {System.out.println("OverridingPrivate.f()");}
    private final void g() {System.out.println("OverridingPrivate.g()");}
}
class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {System.out.println("OverridingPrivate2.f()");}
    public final void g() {System.out.println("OverridingPrivate2.g()");}
}
