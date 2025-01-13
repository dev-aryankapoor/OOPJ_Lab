package kunal_kushswaha.recursion;

public class factorial {
    public static void main(String[] args) {
        // int i = 1;
        // out(10, 1);
        int ans = out(5);
        System.out.println(ans);
    }

    static int out(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * out(n - 1);
    }
    // static void out(int n, int i) {
    // if (n == 1) {
    // System.out.println(i);
    // return;
    // }
    // i *= n;
    // out(n - 1, i);
    // }
}
