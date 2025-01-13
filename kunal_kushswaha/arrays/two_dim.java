package kunal_kushswaha.arrays;

import java.util.*;

public class two_dim {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int [][] arr = new int[3][];

        int[][] arr2 = {
                { 0, 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8 }
        };

        int[][] arr = new int[3][3];

        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }

        for (int[] a : arr) { // enchanced for loop - for(data_type element:array_name){}
            System.out.println(Arrays.toString(a));
        }

        sc.close();
    }
}
