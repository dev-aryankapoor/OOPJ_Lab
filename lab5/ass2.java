package lab5;
import java.util.*;

class box {
    float l;
    float b;
    float h;
}

class box2d {
    void area(float l, float b) {
        float sa = l * b;
        System.out.println(+sa * 40);
    }
}

class box3d extends box2d {
    void area(float l, float b, float h) {
        float sa = 2 * ((l * b) + (b * h) + (h * l));
        System.out.println(+sa * 60);
    }
}

public class ass2 {
    public static void main(String[] args) {
        System.out.println("enter 1 for 2D box and 2 for 3D box: ");
        Scanner sc= new Scanner(System.in);
        int op= sc.nextInt();
        
        switch (op) {
            case 1:
            System.out.println("enter length and breadth for 2D box: ");
            box bx =  new box();
                break;
        
            default:
                break;
        }
    }

}
