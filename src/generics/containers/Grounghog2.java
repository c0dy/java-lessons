package generics.containers;

/**
 * Created by c0dyy on 2/19/17.
 */
public class Grounghog2 extends Groundhog {
    public Grounghog2(int n) { super(n);}
    public int hashCode() {return number;}
    public boolean equals(Object o) {
        return o instanceof Grounghog2 && (number == ((Grounghog2) o).number);
    }
}
