package walktrough2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by codyy on 10/24/2016.
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length a= " + a.length);
        for(int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500);
        System.out.println(Arrays.toString(a));
    }
}
