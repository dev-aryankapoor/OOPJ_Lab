import java.util.Scanner;

class NumberThread extends Thread {
    private int start;
    private int end;

    public NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            try {
                Thread.sleep(5); // Sleep for 5 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NameThread extends Thread {
    private String name;

    public NameThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (char ch : name.toCharArray()) {
            System.out.println(ch);
        }
    }
}

public class assignment2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for range of numbers
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Get user input for student name
        System.out.print("Enter student name: ");
        scanner.nextLine(); // Consume newline character
        String name = scanner.nextLine();

        // Create and start NumberThread
        NumberThread numberThread = new NumberThread(start, end);
        numberThread.start();

        // Create and start NameThread
        NameThread nameThread = new NameThread(name);
        nameThread.start();

        // Close scanner
        scanner.close();
    }
}
