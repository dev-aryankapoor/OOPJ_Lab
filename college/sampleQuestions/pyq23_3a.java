package sampleQuestions;

class rectangle {
    double l;
    double w;

    rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public void find_Area() {
    };
}

class box extends rectangle {
    double l;
    double w;
    double h;

    box(double l, double b, double h) {
        super(l, b);
        this.h = h;
    }

    public void find_Volume() {

    }
}

public class pyq23_3a {

}
