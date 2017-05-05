package walktrough3.encapsulation;

/**
 * Created by codyy on 10/25/2016.
 */
 class Soup1 {
    private Soup1() {}
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}
