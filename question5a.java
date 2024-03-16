import java.util.*;

interface calculate {
    double interest(double amt, int year);
}

class HDFC implements calculate {
    double amt;
    int year;

    // HDFC(double amt, int year) {
    // this.amt = amt;
    // this.year = year;
    // }

    public double interest(double amt, int year) {
        return ((amt * year * 2) / 100);
    };
}

class ICICI implements calculate {
    double amt;
    int year;

    // ICICI(double amt, int year) {
    // this.amt = amt;
    // this.year = year;
    // }

    public double interest(double amt, int year) {
        return ((amt * year * 5) / 100);
    };
}

public class question5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter amt: ");
        double amt = sc.nextInt();

        System.out.println("enter years: ");
        int year = sc.nextInt();

        HDFC h1 = new HDFC();
        ICICI i1 = new ICICI();

        System.out.println("Interest rate for HDFC: " + h1.interest(amt, year));
        System.out.println("Interest rate for ICICI: " + i1.interest(amt, year));

        sc.close();

    }
}
