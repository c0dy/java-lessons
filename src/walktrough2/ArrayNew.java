package walktrough2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by codyy on 10/24/2016.
 */
public class ArrayNew {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int[] a = new int[rand.nextInt(20)];
        System.out.println("Length a= " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
