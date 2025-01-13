package kunal_kushswaha.recursion;

//this is ann example of liner recursion
public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    static int fib(int n) { // Recurrence Relation is the formula : f(n)=f(n-1)+f(n-2)
        // draw recursive tree and see flow of program
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

// liner rec is very inefficient as we can see (from the tree) that certain part
// is being repeated and we know its value already, this can be fixed by Dynamic
// Programming
