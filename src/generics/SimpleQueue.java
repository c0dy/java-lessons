package generics;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by c0dyy on 1/18/17.
 */
public class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void add(T t) { storage.offer(t); }
    public T get() { return storage.poll(); }
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
