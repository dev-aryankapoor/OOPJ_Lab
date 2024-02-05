import java.util.*;
public class lab2_4{
	public static void main (String arg[]){
		Scanner var=new Scanner(System.in);
		System.out.println("enter numbers: ");
		int a= var.nextInt();
		int b= var.nextInt();

		int c,d,i=0,j=0,p,q,h;

		int[] arr1=new int[10];
		int[] arr2=new int[10];

		while(c!=0){
			int c=a%10;
			int arr1[i++]=c;
			a=a/10;}

		while(d!=0){
			int d=b%10;
			int arr2[j++]=d;
			b=b/10;}

		for(p=i;p>=0;p--){
			for(q=j;q>=0;q--){
				if(h=arr1[p]==arr2[q]?arr1[p]:arr2[q]){
					System.out.println(h);}}}
	}}