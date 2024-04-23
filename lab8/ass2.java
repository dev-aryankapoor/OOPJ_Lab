package lab8;

class child1 extends Thread {

    private String name;
    private String chart;

    child1(String name, String chart) {
        this.name = name;
        this.chart = chart;
    }

    public void run() {
        int i = chart.length() - 1;
        while (i >= 0) {
            System.out.println(name + chart.charAt(i));
            try {
                Thread.sleep(100);
            }

            catch (InterruptedException e) {
                System.out.println("inturrepted child one");
                e.printStackTrace();
            }
            i--;
        }
    }
}

class child2 extends Thread {

    private String name;
    private String chart;

    child2(String name, String chart) {
        this.name = name;
        this.chart = chart;
    }

    public void run() {
        int j = chart.length() - 1;
        while (j >= 0) {
            System.out.println(name + chart.charAt(j));
            try {
                Thread.sleep(100);
            }

            catch (InterruptedException e) {
                System.out.println("inturrepted child two");
                e.printStackTrace();
            }
            j--;
        }
    }
}

public class ass2 {
    public static void main(String[] args) {

        child1 c1 = new child1("child thread 1 ", "abcdefghij");
        c1.start();

        child2 c2 = new child2("child thread 2 ", "1234567890");
        c2.start();

        String chart = "!@#$%^&*()";
        int j = chart.length() - 1;
        while (j >= 0) {
            System.out.println("main " + chart.charAt(j));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("interrupted main");
                e.printStackTrace();
            }
            j--;
        }
    }
}
