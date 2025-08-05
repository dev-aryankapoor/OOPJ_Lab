package dp.SubsetSum;

public class SubsetSumMemo {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 8, 10 };
        int sum = 1;
        Boolean[][] memo = new Boolean[arr.length + 1][sum + 1];
        boolean answer = subset_sum(arr, sum, arr.length, memo);
        System.out.println(answer);
    }

    private static boolean subset_sum(int[] arr, int sum, int n, Boolean[][] memo) {
        if (n == 0)
            return false;
        if (sum == 0)
            return true;

        if (memo[n][sum] != null) {
            return memo[n][sum];
        }

        if (arr[n - 1] <= sum) {
            memo[n][sum] = (subset_sum(arr, sum - arr[n - 1], n - 1, memo) || subset_sum(arr, sum, n - 1, memo));
        } else if (arr[n - 1] > sum) {
            memo[n][sum] = subset_sum(arr, sum, n - 1, memo);
        }
        return memo[n][sum];
    }
}