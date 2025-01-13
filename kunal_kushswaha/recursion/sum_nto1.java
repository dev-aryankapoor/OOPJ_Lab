package kunal_kushswaha.recursion;

public class sum_nto1 {
    public static void main(String[] args) {
        int ans = sum(10);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }
}
