package lab6;

interface Motor {
    int capacity = 5;

    void run();

    void consume();
}

class washing_machine implements Motor {
    public void run() {
        System.out.println("is running on capacity: " + capacity);
    }

    public void consume() {
        System.out.println("is consumig on capacity: " + capacity);
    }
}

public class ass2 {
    public static void main(String[] args) {
        washing_machine m1 = new washing_machine();
        m1.consume();
        m1.run();
    }

}
