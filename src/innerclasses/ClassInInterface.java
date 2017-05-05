package innerclasses;

/**
 * Created by c0dyy on 1/7/17.
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Hello world!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
