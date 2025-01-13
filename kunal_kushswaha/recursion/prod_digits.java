package kunal_kushswaha.recursion;

public class prod_digits {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n % 10 == n) { // gives the last digit, otherwise answer will always come 0
            return n;
        }

        return (n % 10) * sum(n / 10);
    }
}
