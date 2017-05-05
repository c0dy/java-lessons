package test;

/**
 * Created by c0dyy on 1/12/17.
 */
public class Product<T extends Product<T>> implements Comparable<T> {
    private String name;
    private String price;


    public int compareTo(T p) {
        return 0;
    }
}
