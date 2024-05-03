package exception;

public class nested_try_catch {
    public static void main(String[] args) {
        int A[] = { 30, 20, 10, 40, 0 };

        try {
            int c = A[0] / A[2]; // catch one
            System.out.println("division is: " + c);

            try {
                System.out.println(A[5]); // catch second
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index is invalid.");
            }
        }

        catch (ArithmeticException e) {
            System.out.println("denominator should not be zero.");
        }

        System.out.println("BYE");
    }
}
