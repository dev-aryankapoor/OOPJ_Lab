package threading;

class test extends Thread { // using multiple classes
    public void run() { // override run() method

        int i = 1;
        while (i < 30) {
            System.out.println(i + " hello");
            i++;
        }
    }
}
public class using_thread_class {
    public static void main(String[] args) {
        test t = new test();
        t.start();

        int i = 1;
        while (i < 30) {
            System.out.println(i + " world");
            i++;
        }
    }
}

// class test extends Thread { // using single class
// public void run() {

// int i = 1;
// while (i < 30) {
// System.out.println(i + " hello");
// i++;
// }
// }

// public static void main(String[] args) {
// test t = new test();
// t.start();

// int i = 1;
// while (i < 30) {
// System.out.println(i + " world");
// i++;
// }
// }
// }
