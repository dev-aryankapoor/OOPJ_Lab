import java.util.Scanner;

public class lab3_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box box1 = new Box();
        System.out.println("Volume of box1: " + box1.volume());

        System.out.print("Enter the side length of the cube: ");
        double sideLength = scanner.nextDouble();
        Box box2 = new Box(sideLength);
        System.out.println("Volume of box2: " + box2.volume());

        System.out.print("Enter the length of the box: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();
        Box box3 = new Box(length, width, height);
        System.out.println("Volume of box3: " + box3.volume());
    }
}