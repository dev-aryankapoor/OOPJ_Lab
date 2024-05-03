package lab6;

import java.util.*;

interface details {
    double earnings(int basic);

    double deduction(int basic);

    double bonus(int basic);
}

class manager implements details {
    public double earnings(int basic) {
        double DA = 0.8 * basic;
        double HRA = 0.15 * basic;
        return basic + DA + HRA;

    };

    public double deduction(int basic) {
        return 0.12 * basic;
    };

    public double bonus(int basic) {
        return -1;
    }
}

class substaff extends manager {
    public double bonus(int basic) {
        return 0.5 * basic;
    };
}

public class ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bsic salary: ");
        int base = sc.nextInt();
        substaff s1 = new substaff();
        double ear = s1.earnings(base);
        double ded = s1.deduction(base);
        double bon = s1.bonus(base);

        System.out.println("net earnings: " + ear);
        System.out.println("deducition: " + ded);
        System.out.println("bonus: " + bon);
        sc.close();
    }

}
