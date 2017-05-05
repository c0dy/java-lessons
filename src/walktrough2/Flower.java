package walktrough2;

/**
 * Created by codyy on 10/24/2016.
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constractor with value int, petalCount = " + petalCount);
    }
    Flower(String ss) {
        System.out.println("Constractor with value String, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("Arguments String and int");
    }
    Flower() {
        this("hi", 47);
        System.out.println("Constractor without arguments");
    }
    void prinrPetalCount(){
        System.out.println("petalCount= " + petalCount + " s= " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.prinrPetalCount();
    }
}
