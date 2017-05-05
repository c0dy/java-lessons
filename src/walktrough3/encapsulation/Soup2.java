package walktrough3.encapsulation;

/**
 * Created by codyy on 10/25/2016.
 */
 class Soup2 {
    private Soup2() {}
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}
