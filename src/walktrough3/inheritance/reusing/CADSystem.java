package walktrough3.inheritance.reusing;

import static net.mindview.util.Print.print;

/**
 * Created by codyy on 10/25/2016.
 */
public class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i) {
        super(i + 1);
        for(int j = 1; j < lines.length; j++)
            lines[j] = new Line(j, j*j);
        c = new Circle(1);
        t = new Triangle(1);
        print("Combined constructor");
    }
    void dispose() {
        System.out.println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 1; i--)
            lines[i].dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {

        } finally {
            x.dispose();
        }
    }
}
class Shape {
    Shape(int i) {System.out.println("Constructor Shape");}
    void dispose() {System.out.println("Complete Shape");}
}
class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }
        void dispose() {
            System.out.println("Deleting Circle");
            super.dispose();
        }
}
class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }
        void dispose() {
            System.out.println("Deleting Triangle");
            super.dispose();
        }
}
class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: " + start + ", " + end);
    }
    void dispose() {
        System.out.println("Deleting Line: " + start + ", " + end);
        super.dispose();
    }
}
