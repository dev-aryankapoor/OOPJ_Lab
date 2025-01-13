package kunal_kushswaha.searching.binary;

public class order_agnostic_binarySearch {
    public static void main(String[] args) {
        // int[] arr = { 100, 50, 16, 8, -1, -10 };
        int[] arr = { 1, 3, 6, 7, 50 };
        int ans = bs(arr, 50);
        System.out.println(ans);
    }

    static int bs(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return m;
            }
            // we can also use boolean here
            if (arr[s] < arr[e]) {

                if (target > arr[m]) {
                    s = m + 1;
                }

                else
                    e = m - 1;
            } else {
                if (target < arr[m]) {
                    s = m + 1;
                }

                else
                    e = m - 1;
            }

        }

        return -1;
    }
}
