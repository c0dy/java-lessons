package holding;

import java.util.*;

/**
 * Created by c0dyy on 1/8/17.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(15));
        System.out.println(intset);
    }
}
