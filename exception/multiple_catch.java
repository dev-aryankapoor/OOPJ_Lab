package exception;

public class multiple_catch {
    public static void main(String[] args) {
        int A[] = { 30, 20, 10, 40, 0 };

        try {
            int c = A[0] / A[2];
            System.out.println("division is: " + c);

            System.out.println(A[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("denominator should not be zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index is invalid.");
        }

        System.out.println("BYE");
    }
}
