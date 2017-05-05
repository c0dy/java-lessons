package walktrough3.inheritance.reusing.composition;

/**
 * Created by codyy on 10/25/2016.
 */
 class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "designed";
    }
    public String toString() {return s;}

}
