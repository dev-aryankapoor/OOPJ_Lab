// import java.util.*;

// import java.io.*;

// //mohamed tharick kuthpudeen
// 4:37 PM
// I/p : arr = [2,1,4,7,3,2,5]
// O/p: 5
// Explanation: The largest mountain is [1,4,7,3,2] which has length 5.

public class Solution {
    public int[] ans() {

        int[] arr = { 2, 1, 4, 7, 3, 2, 5 };
        int[] anss = new int[5];
        int count = 0, a = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                continue;
            } else {
                while (arr[i] < arr[i + 1]) {
                    anss[count] = arr[i];
                    anss[count + 1] = arr[i + 1];
                    i++;
                    count++;
                }
            }
            a = i;
        }

        for (int j = 0; j < count; j++) {
            anss[3] = arr[a + (j + 1)];
        }
        return anss;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.ans());
    }
}
