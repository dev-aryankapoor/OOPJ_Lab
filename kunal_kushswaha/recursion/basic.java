package kunal_kushswaha.recursion;

public class basic {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) { // recursion is a function that calls itself, use instead of repetition
        // Space Complexity not constant
        // visualise it using Recursion Tree
        if (n == 5) { // base condition : condition where rec stops making new calls
            System.out.println(5);
            return;
        }

        System.out.println(n);
        // this is called Tail Recursion : print() here is the last funstion called not
        // fibonacci at it requires addition and returning it.
        print(n + 1); // each function call will be there seperately in STACK (take memory)
    }
}
