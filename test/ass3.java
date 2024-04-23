package test;

import java.util.*;

class myException extends Exception {
    public myException(String s) {
        super(s);
    }
}

class hdfc {
    int accno;
    double bal;

    hdfc(int accno, double bal) {
        this.accno = accno;
        this.bal = bal;
    }

    public double withdraw(double cash) throws myException {
        if (bal - cash < 0) {
            throw new myException("Insufficient balance for withdrawal");
        }
        return bal - cash;
    }

    public double deposit(double cash) {
        return bal + cash;
    }
}

public class ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hdfc pr1 = new hdfc(885, 10000);
        System.out.println("Press 1 for withdrawal and 2 for depositing:");
        int op = sc.nextInt();

        try {
            if (op == 1) {
                System.out.println("Enter the amount:");
                double cash = sc.nextDouble();
                System.out.println("Account number " + pr1.accno + " with balance " + pr1.withdraw(cash));
            } else {
                System.out.println("Enter the amount:");
                double cash = sc.nextDouble();
                System.out.println("Account number " + pr1.accno + " with balance " + pr1.deposit(cash));
            }
        } catch (myException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
