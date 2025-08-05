package lab8;

import java.util.Scanner;

class l8_1 {

    int num;

    void processInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        try {
            checkForNegativeNumber(num);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            return;
        }

        int sumOfDigits = calculateSumOfDigits(num);
        System.out.println("Sum of digits: " + sumOfDigits);
    }

    private void checkForNegativeNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
    }

    private int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        // NumberProcessor processor = new NumberProcessor();
        // processor.processInput();
    }
}
