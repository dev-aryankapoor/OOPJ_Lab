package threading;

class my implements Runnable { // is like a CART
    public void run() {
        int i = 1;
        while (i < 30) {
            System.out.println(i + " hello");
            i++;
        }
    }
}

public class using_runnable_interface {
    public static void main(String[] args) {
        my m = new my();
        Thread t = new Thread(m); // is like a HORSE, carries m CART, created object of Thread
        t.start();
        int i = 1;
        while (i < 30) {
            System.out.println(i + " world");
            i++;
        }
    }
}

// SIMILARLY can also be done using same class