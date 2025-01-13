package kunal_kushswaha.recursion;

public class one_to_n {
    public static void main(String[] args) {
        int i = 1;
        out(5, i);
    }

    static void out(int n, int i) {

        if (i == n + 1) {
            return;
        }

        System.out.println(i);
        out(n, i + 1);

        // BETTER WAY
        // if(n==0){
        // return;
        // }

        // out(n-1);
        // System.out.println(n);
    }
}
