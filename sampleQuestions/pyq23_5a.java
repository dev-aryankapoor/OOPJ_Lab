package sampleQuestions;

import java.util.*;

class Invalid_Age extends Exception {
    public String toString() {
        return "entered age is invalid";
    }
}

class age {
    int age;

    public int check(int age) throws Invalid_Age {
        if (age > 100 || age < 0) {
            throw new Invalid_Age();
        }
        return age;
    }
}

public class pyq23_5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        age a = new age();
        System.out.println("enter your age: ");
        int in = sc.nextInt();
        try {
            a.check(in);
            System.out.println("your age is " + in);
        } catch (Invalid_Age e) {
            System.out.println(e);
        }
        sc.close();
    }
}
