package lab4;
import java.util.Scanner;

public class ass4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
System.out.println("the upper triangle elements are : ");
        for (int i = 0; i < 1; i++) {
         System.out.println(matrix[i][i]);
        System.out.println(matrix[i+1][i]);
        System.out.println(matrix[i][i+1]);
        }
    scanner.close();
    }
}