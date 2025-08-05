package lab3;

import java.util.Scanner;

class savingsAcc {
    static float int_rate = 5;
    int acc_no;
    String name;
    float balance;

    float modify_int_rate(float new_rate) {
        float temp;
        temp = int_rate;
        int_rate = new_rate;
        new_rate = temp;

        System.out.println("!Rate Modified!");

        return int_rate;
    };

    float cal_int(int acc_no, String name, float balance) {
        float interest = (balance * int_rate * 5) / 100;
        System.out.println("name: " + name);
        System.out.println("account number: " + acc_no);
        System.out.println("balance: " + balance);
        return interest;

    }

}

public class ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = sc.nextLine();
        System.out.println("enter account number: ");
        int acc_no = sc.nextInt();
        System.out.println("enter balance: ");
        float balance = sc.nextFloat();

        savingsAcc a1 = new savingsAcc();
        a1.name = name;
        a1.acc_no = acc_no;
        a1.balance = balance;
        a1.cal_int(acc_no, name, balance);
        a1.modify_int_rate(7);
        // savingsAcc.modify_int_rate(7);
        a1.cal_int(acc_no, name, balance);

        sc.close();
    }
}
