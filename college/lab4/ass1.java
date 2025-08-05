package lab4;

import java.util.Scanner;

public class ass1 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int i;
        System.out.println("Enter the elements of the array: ");

        for (i = 0; i < 5; i++) {

            array[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (array[i] == array[j])
                    System.out.println("the repeadted element is: " + array[i]);
            }
        }
        sc.close();
    }
}