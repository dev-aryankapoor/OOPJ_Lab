package sampleQuestions;

interface volume {
    double calc_vol(double radius, double height);

    double PI = 3.14;
}

class cylinder implements volume {
    double r;
    double h;

    // cylinder(double r, double h) {
    // this.r = r;
    // this.h = h;
    // }

    public double calc_vol(double r, double h) {
        double v;
        v = PI * r * r * h;
        return v;
    }
}

class cone implements volume {
    double r;
    double h;

    // cone(double r, double h) {
    // this.r = r;
    // this.h = h;
    // }

    public double calc_vol(double r, double h) {
        double v;
        v = (PI * r * r * h) / 3;
        return v;
    }
}

public class pyq23_4b {
    public static void main(String[] args) {
        cylinder cy = new cylinder();
        cone co = new cone();

        double a1 = cy.calc_vol(10, 20);
        double a2 = co.calc_vol(10, 20);

        System.out.println("cylinder: " + a1);
        System.out.println("cone: " + a2);
    }
}
