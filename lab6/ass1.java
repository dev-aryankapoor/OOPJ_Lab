package lab6;

import java.util.*;

abstract class student {
    public int roll_no;
    public int regno;

    // public student(int roll_no, int regno){
    // this.roll_no=roll_no;
    // this.regno=regno;
    // }

    abstract void course(String crs);
}

class kiitian extends student {
    String crs;

    // super(regno,roll_no);

    public kiitian(String crs) {
        this.crs = crs;
    }

    public void course(String crs) {
        System.out.println("your course is: " + crs);
    }
}

public class ass1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your course: ");
        String crs = sc.nextLine();
        kiitian std = new kiitian(crs);
        std.course(crs);
        sc.close();
    }
}
