package walktrough2;

/**
 * Created by doyy on 10/24/2016.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
}
