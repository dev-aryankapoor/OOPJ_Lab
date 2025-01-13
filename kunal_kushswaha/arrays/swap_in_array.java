package kunal_kushswaha.arrays;

import java.util.Arrays;

public class swap_in_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(arr));
        swap(arr, 2, 6);
        System.out.println("swapped array: " + Arrays.toString(arr));
    }

    static void swap(int[] ar, int ind1, int ind2) {
        int temp = ar[ind1];
        ar[ind1] = ar[ind2];
        ar[ind2] = temp;
    }
}
