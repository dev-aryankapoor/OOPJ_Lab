package test;

import java.util.Scanner;

class HDFC {
    int accNo;
    double balance;

    HDFC(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void withdrawal(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Please try again.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
            System.out.println("Updated balance: " + balance);
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
        System.out.println("Updated balance: " + balance);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        System.out.println("Insufficient Balance. Please Try Again.");
    }
}

class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HDFC ac1 = new HDFC(22052665, 1000);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double amt = scanner.nextDouble();
                    try {
                        ac1.withdrawal(amt);
                    } catch (InsufficientBalanceException e) {
                    }
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    ac1.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Thank you.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}