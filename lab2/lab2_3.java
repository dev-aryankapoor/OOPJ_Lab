import java.util.*;
public class lab2_3{
	public static void main (String arg[]){
		Scanner var=new Scanner(System.in);
		System.out.println("enter numbers: ");
		int a= var.nextInt();
		int b= var.nextInt();

		int and,or,xor;

		and=a&b;
		or=a|b;
		xor=a^b;

		System.out.println("and: "+and);
		System.out.println("or: "+or);
		System.out.println("xor: "+xor);

		var.close();
	}}