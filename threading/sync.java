package threading;

class mydata {
    synchronized void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

class mythread1 extends Thread {
    mydata d;

    mythread1(mydata d) {
        this.d = d;
    }

    public void run() {
        d.display("hello world");
    }
}

class mythread2 extends Thread {
    mydata dat;

    mythread2(mydata data) {
        dat = data;
    }

    public void run() {
        dat.display(" welcome ");
    }
}

public class sync {
    public static void main(String[] args) {
        mydata d = new mydata();
        mythread1 t1 = new mythread1(d);
        mythread2 t2 = new mythread2(d);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }

}
