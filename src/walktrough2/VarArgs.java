package walktrough2;

/**
 * Created by codyy on 10/24/2016.
 */
class A {int i;}
public class VarArgs {
    public static void printArray(Object[] args) {
        for(Object obj : args)
            System.out.println(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(47), new Float(3.14), new Double(11.11)});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}
