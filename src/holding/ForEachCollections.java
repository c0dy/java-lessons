package holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by c0dyy on 1/8/17.
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "One two three four five".split(" "));
        for(String s : cs)
            System.out.println("'" + s + "' ");
    }
}
