package kunal_kushswaha.arrays;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(3); // present in the collection framework, 'Integer' here is the
                                                      // wrapper class

        // ArrayList list = new ArrayList(10);
        // ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // System.out.println(list);
        // System.out.println(list.contains(4));

        list.set(3, 44);
        System.out.println(list);
        // System.out.println(list.contains(4));

        // list.remove(4);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // output
        // for (int i = 0; i < 5; i++) {
        // System.out.println(list.get(i));
        // }

        for (int num : list) {
            System.out.println(num);
        }

        sc.close();

    }
}
