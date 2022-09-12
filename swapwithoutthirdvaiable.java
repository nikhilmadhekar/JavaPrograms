package logicalpgm;

import java.util.Scanner;

public class swapwithoutthirdvaiable 
{	
	public static void main(String[] args) 
	{
//		int a=20,b=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Before swapping the values of a "+a+" and value of b "+b);
		
		a=a+b; //a=20+10=30;
		b=a-b; //b=30-10=20;
		a=a-b; //a=30-20=10;
		
		System.out.println("after swaaping the value of a "+a+" and value of b "+b);
	}
	
	
}
