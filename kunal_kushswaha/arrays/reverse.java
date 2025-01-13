package kunal_kushswaha.arrays;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 60, 7, 8, 9, 10 };
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] ar, int ind1, int ind2) {
        int temp = ar[ind1];
        ar[ind1] = ar[ind2];
        ar[ind2] = temp;
    }

    // two pointer method
    static void rev(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // for (int i = 0; i <= (arr.length / 2) - 1; i++) {
        // swap(arr, start++, end--);
        // }

        while (start < end) {
            swap(arr, start++, end--);
            // start++;
            // end--;
        }
    }
}
