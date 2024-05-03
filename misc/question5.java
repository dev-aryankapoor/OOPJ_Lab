abstract class figure {
    abstract double area();

    void callme() {
        System.out.println("hello");
    }
}

class triangle extends figure {
    public double base;
    private double height;

    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

class rectangle extends figure {
    private double breadth;
    private double length;

    rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;

    }
}

public class question5 {
    public static void main(String[] args) {

        triangle t = new triangle(5, 5);
        rectangle r = new rectangle(5, 5);

        System.out.println("area rectangle: " + r.area());
        System.out.println("area triangle: " + t.area());
        t.callme();

    }
}
