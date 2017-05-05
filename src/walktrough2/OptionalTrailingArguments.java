package walktrough2;

/**
 * Created by codyy on 10/24/2016.
 */
public class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        System.out.print("Needed: " + required + " ");
        for(String s : trailing)
            System.out.println(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}
