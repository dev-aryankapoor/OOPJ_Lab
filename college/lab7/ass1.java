package lab7;

public class ass1 {
    public static void main(String[] args) {
        int A[] = { 0, 1, 2, 3, 4, 5 };

        try {
            int c = A[10];
            System.out.println(+c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index");
        } finally {
            System.out.println("code has ended.");
        }
    }
}
