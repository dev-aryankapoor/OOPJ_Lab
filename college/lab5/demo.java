package lab5;

import geometry.Temp;

public class demo {
    public static void main(String[] args) {
        Temp circle = new Temp();

        circle.setRadius(23.4);
        double ra = circle.getRadius();

        double area = 3.14 * ra * ra;
        double peri = 2 * 3.14 * ra;

        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + peri);
    }
}
