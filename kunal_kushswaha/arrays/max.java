package kunal_kushswaha.arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 60, 7, 8, 9, 10 };
        int mx = maxi(arr);
        System.out.println("maximum element: " + mx);
    }

    static int maxi(int[] ar) {
        if (ar == null) {
            return -1;
        }
        if (ar.length == 0) {
            return -1;
        }
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

    static int maxiRange(int[] ar, int start, int end) {
        if (ar == null) {
            return -1;
        }
        if (start > end) {
            return -1;
        }
        int max = ar[start];
        for (int i = start; i <= end; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }
}
