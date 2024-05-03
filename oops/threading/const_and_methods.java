package threading;

// class myrun implements Runnable{
//     public void run(){}
// }

class mythread extends Thread {
    mythread(String name) {
        super(name);
        // // setPriority(Thread.MAX_PRIORITY);
        // setPriority(Thread.MIN_PRIORITY + 2);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }
}

public class const_and_methods {
    public static void main(String[] args) {
        mythread t = new mythread("thread1");

        // Thread t = new Thread("myname");
        // Thread t = new Thread(new myrun());
        // Thread t = new Thread(new myrun(), "myname");

        // you can set priority here too

        // System.out.println("ID:" + t.getId());
        System.out.println("NAME:" + t.getName());
        // System.out.println("PRIORITY:" + t.getPriority());
        System.out.println("ALIVE:" + t.isAlive());
        t.start();
        // System.out.println("STATE:" + t.getState()); // add a '.' to see all possible
        // states
        t.setPriority(9);
        System.out.println(t.getPriority());

        // t.start();
        t.interrupt();

    }
}
