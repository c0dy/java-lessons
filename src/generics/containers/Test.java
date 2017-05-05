package generics.containers;

/**
 * Created by c0dyy on 2/19/17.
 */
public abstract class Test<C> {
    String name;
    public Test(String name) { this.name = name;}
    abstract int test(C container, TestParam tp);
}
