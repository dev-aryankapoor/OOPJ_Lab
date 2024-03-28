abstract class area {
    abstract float calculate();
}

class square extends area {
    int l;
    int b;

    square(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public float calculate() {
        float ar;
        ar = l * b;
        return ar;
    }
}

class circle extends area {
    int r;

    circle(int r) {
        this.r = r;
    }

    public float calculate() {
        float ar;
        ar = 3.14f * r * r;
        return ar;
    }
}

public class test {
    public static void main(String[] args) {
        circle c = new circle(4);
        square s = new square(4, 5);

        float ca = c.calculate();
        float sa = s.calculate();

        System.out.println(+ca);
        System.out.println(+sa);

    }

}