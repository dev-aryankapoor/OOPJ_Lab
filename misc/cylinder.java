class circle {
    public double r;

    double area() {
        return r * r * Math.PI;
    }

    double peri() {
        return r * 2 * Math.PI;
    }
}

class cylinder extends circle {
    public double height;

    double volume() {
        return height * super.area();
    }
}

class answer {
    public static void main(String[] args) {

        cylinder cy1 = new cylinder();
        cy1.r = 2;
        cy1.height = 2;

        System.out.println("area is: " + cy1.area());
        System.out.println("perimeter is: " + cy1.peri());
        System.out.println("volume is: " + cy1.volume());
    }
}
