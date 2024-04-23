package strings;

import java.util.*;

public class uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your text: ");
        String in = sc.nextLine();
        String out = "";

        for (int i = 0; i < in.length(); i++) {
            out += in.charAt(i);
        }
        System.out.println("reversed string is: " + out);
        sc.close();
    }
}
