package walktrough2;

/**
 * Created by codyy on 10/24/2016.
 */
public class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn() {
        checkedOut = false;
    }
    public void finalize() {
        if(checkedOut) System.out.println("Error: checkedOut");
    }
}

