package lab5;

import java.util.Scanner;

public class test {

    static double interest(double a, double b, double c) {
        double res;
        res = a * b * c / 100;
        return res;
    }

    public static void main(String[] args) {
        double p, r, t, tot;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Price : ");
        p = scanner.nextDouble();
        System.out.println("Enter the Rate : ");
        r = scanner.nextDouble();
        System.out.println("Enter the Time : ");
        t = scanner.nextDouble();

        tot = interest(p, r, t);
        System.out.println("Interest : " + tot);
        scanner.close();
    }
}
