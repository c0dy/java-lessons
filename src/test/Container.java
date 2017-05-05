package test;

/**
 * Created by c0dyy on 1/12/17.
 */
public class Container<T extends Product> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Container<Product> container = new Container<>();
        container.setItem(new Phone());
        Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        camera1.compareTo(camera2);
    }
}
