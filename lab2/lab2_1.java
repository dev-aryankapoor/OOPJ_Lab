import java.util.*;
public class lab2_1{
	public static void main (String arg[]){
		Scanner var=new Scanner(System.in);
		System.out.println("enter numbers: ");
		int a= var.nextInt(); //next for string, nextline for whole sentence
		int b= var.nextInt();
		int c= var.nextInt();
		
		int temp,largest;
		
		temp=a>b?a:b;
		largest=temp>c?temp:c;
		
		System.out.println("the largest number is "+largest);
		var.close();
	}}