package logicalpgm;

import java.util.Scanner;

public class leapyear 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check leap year or not");
		int year=sc.nextInt();
	
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not the leap year");
		}
	
	}
}
