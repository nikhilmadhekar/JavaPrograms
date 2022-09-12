package logicalpgm;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%7==0)
		{
			System.out.println("Foo");
		}
		else if(num%11==0)
		{
			System.out.println("Bar");
		}
		else if(num%7==0 & num%11==0)
		{
			System.out.println("foo bar");
		}
	}
}
