package interfaces.interfaceprocessor;

/**
 * Created by c0dyy on 1/7/17.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
