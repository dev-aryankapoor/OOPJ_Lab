class twoD {
    double l;
    double b;

    double cost(double l, double b) {
        return l * b * 40;
    }
}

class threeD extends twoD {
    double h;

    double cost(double l, double b, double h) {
        return 120 * ((l * b) + (b * h) + (h * l));
    }
}

public class buybox {
    public static void main(String[] args) {

        threeD boxbox = new threeD();

        System.out.println(boxbox.cost(12, 12, 12));
    }
}
