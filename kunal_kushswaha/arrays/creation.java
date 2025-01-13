package kunal_kushswaha.arrays;

import java.util.*;

public class creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // int arr[] = new int[size];

        String[] arr2 = new String[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter array element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // System.out.print("array elements are: ");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }

        // System.out.print("array elements are: ");
        // for (int num : arr) { //for every element in array
        // System.out.print(num + " "); //print the element, num represents element
        // }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("enter string array element " + i + ": ");
            arr2[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(arr2));

        arr2[3] = "aryan"; // modify

        System.out.println(Arrays.toString(arr2));

        sc.close();
    }
}
