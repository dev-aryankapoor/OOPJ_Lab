package strings;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your text: ");
        String in = sc.nextLine();
        String out = "";
        // int count = 0;
        for (int i = in.length() - 1; i >= 0; i--) {
            out += in.charAt(i);
        }
        System.out.println("reversed string is: " + out);
        sc.close();
    }
}
