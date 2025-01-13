package kunal_kushswaha.recursion;

public class nto1 {
    public static void main(String[] args) {
        out(5);
    }

    static void out(int n) {
        if (n != 0) {
            System.out.println(n);
            out(n - 1);

            // we can also use --n here
        }
        // we can also do this
        // if (n==0) {
        // return;
        // }
    }
}
