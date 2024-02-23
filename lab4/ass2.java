package lab4;

import java.util.Scanner;

public class ass2 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements of your array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        int i;
        System.out.println("Enter the elements of the array: ");
        
        for (i = 0; i < n; i++) {
            
            array[i] = sc.nextInt();
        }
        
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (array[i] > array[j]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("sorted array is : ");
        for (i = 0; i < n; i++) {

            System.out.println(+array[i]);
        }
    }
}