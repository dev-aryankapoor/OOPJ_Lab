public class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }

    public Box(double side) {
        length = side;
        width = side;
        height = side;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }
}