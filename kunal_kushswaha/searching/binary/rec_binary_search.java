package kunal_kushswaha.searching.binary;

public class rec_binary_search {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 7, 50 };
        int ans = rbs(arr, 3, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int rbs(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        else if (arr[m] < target) {
            return rbs(arr, target, m + 1, e);
        }

        else
            return rbs(arr, target, s, m - 1);

    }
}
