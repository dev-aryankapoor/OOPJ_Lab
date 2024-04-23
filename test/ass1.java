package test;

interface calc {
    double diagonal(int l, int b);

    double area(int l, int b);
}

class ra implements calc {
    int l;
    int b;

    public double diagonal(int l, int b) {
        return Math.sqrt((l * l) + (b * b));
    }

    public double area(int l, int b) {
        return 0.5 * b * l;
    }
}

class rect implements calc {
    int l;
    int b;

    public double diagonal(int l, int b) {
        return Math.sqrt((l * l) + (b * b));
    }

    public double area(int l, int b) {
        return b * l;
    }
}

public class ass1 {
    public static void main(String[] args) {
        ra ra1 = new ra();
        rect rect1 = new rect();

        System.out.println("diagonal triangle:" + ra1.diagonal(10, 20));
        System.out.println("area triangle:" + ra1.area(10, 20));

        System.out.println("diagonal rectangle:" + rect1.diagonal(10, 20));
        System.out.println("area reactangle:" + rect1.area(10, 20));
    }
}
