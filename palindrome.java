package logicalpgm;

import java.util.Scanner;

public class palindrome
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();	//101
		
		int rev=0,r;
		int temp;
		temp=num;			//temp=101;
		while(num>0)		//while(101>0)		//while(10>0)		//while(1>0)		//while(0>0) condition false
		{
			r=num%10;		//r=101%10=1;		//r=10%10=0;		//r=1%10=1;
			rev=rev*10+r;	//rev=0*10+1=1;		//rev=1*10+0=10;	//rev=10*10+1=101;
			num=num/10;		//num=101/10=10;	//num=10/10=1;		//num=1/10=0;
		}
		if(rev==temp)	//if(101==101)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}
}

