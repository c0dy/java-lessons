package walktrough3.inheritance.reusing;

/**
 * Created by codyy on 10/25/2016.
 */
public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;
    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("Constructor PlaceSetting");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }

}
