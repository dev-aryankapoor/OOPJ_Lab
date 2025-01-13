package kunal_kushswaha.searching.binary;

//this is an example of Divide and conqure recurence relation as we are dividing the search area as we search.
//recurrence relation is b(n) = O(1) {find middle one using comparing} + b(n/2)

public class binary_search {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 7, 9 };
        int ans = binarySearch(arr, 99);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            // int mid = (s+e)/2; might exceed the int limit
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return -1;
    }
}
