package kunal_kushswaha.recursion;

//1,2,3,4,5

public class binary_search {
    static int bs(int n, int[] arr, int start, int end) {

        if (start > end)
            return -1;

        int mid = (start + (end - start) / 2);

        if (arr[mid] == n) {
            return mid;
        }

        if (arr[mid] < n) {
            return bs(n, arr, mid + 1, end);
        }
        return bs(n, arr, start, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int answer = bs(5, arr, 0, 4);
        System.out.println(answer);
    }
}
