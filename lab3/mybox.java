package lab3;
import java.util.*;
class myBox
{
    public static void main(String arg[])
    {
        float l,w,h;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your box:");
        l= input.nextFloat();
        System.out.println("Enter the width of your box:");
        w= input.nextFloat();
        System.out.println("Enter the height of your box:");
        h= input.nextFloat();
        Box b1= new Box();
        Box b2= new Box(l);
        Box b3=new Box(l,w);

        b1.volume();
        b2.volume();
        b3.volume();

    }
}