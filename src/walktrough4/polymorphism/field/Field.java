package walktrough4.polymorphism.field;

/**
 * Created by c0dyy on 11/29/16.
 */
public class Field {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field= " + sup.field + ", sup.getField()= " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field= " + sub.field + ", sub.getField()= " + sub.getField() + ", sub.getSuperField()= "
        + sub.getSuperField());
    }
}
