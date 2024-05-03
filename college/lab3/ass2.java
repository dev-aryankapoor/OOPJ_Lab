package lab3;

import java.util.*;

class Box {
    float l;
    float w;
    float h;

    void volume() {

        System.out.println("the volume is : " + l * w * h);
    }

    Box() {
        l = 0;
        w = 0;
        h = 0;
    }

    Box(float a) {
        l = a;
        w = a;
        h = a;
    }

    Box(float a, float b, float c) {
        l = a;
        h = b;
        w = c;
    }
}

class ass2 {
    public static void main(String arg[]) {
        float l, w, h;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your box:");
        l = input.nextFloat();
        System.out.println("Enter the width of your box:");
        w = input.nextFloat();
        System.out.println("Enter the height of your box:");
        h = input.nextFloat();
        Box b1 = new Box();
        Box b2 = new Box(l);
        Box b3 = new Box(l, w, h);

        b1.volume();
        b2.volume();
        b3.volume();

        input.close();

    }
}
