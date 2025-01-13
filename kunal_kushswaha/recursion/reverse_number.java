package kunal_kushswaha.recursion;

//important question
public class reverse_number {
    public static void main(String[] args) {
        thocc(1824);
        System.out.println(sum);
    }

    static int sum = 0;

    static void thocc(int n) {
        if (n == 0) {
            return;
        }

        sum = (sum * 10) + (n % 10);
        thocc(n / 10);
    }

    // sometimes you need some additional arguments, in that case make another
    // helper function
    static void thocc2(int n) {
        if (n == 0) {
            return;
        }

        sum = (sum * 10) + (n % 10);
        thocc2(n / 10);
    }

}
