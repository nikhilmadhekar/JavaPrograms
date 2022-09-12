package logicalpgm;

import java.util.Scanner;

public class NumberToWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		
		if(n<0 || n>999)
		{
			System.out.println("Wrong input");
			
		}
		else
		{
			int a=n%10;
			 int b=n/10;
			 int c=b%10;
			 int d=n/100;
			 String arr[]= {"Zero ","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
			 //System.out.println(arr[d]+arr[c]+arr[a]);
			 if(n<100)
			 {
				 System.out.println(arr[c]+arr[a]);
			 }
			 else if(n>99)
			 {
				 System.out.println(arr[d]+arr[c]+arr[a]);
			 }
		}
		
		
	}
}
