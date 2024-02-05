class lab1_4{
	public static void main(String ar[]){

		int a=1221;
		int b=a;
		int sum=0;

		while(b!=0){
			int c=b%10;
			sum=(sum*10)+c;
			b=b/10;}

		if(sum==a)
			System.out.println("yes");

		else
			System.out.println("no");

		}}

