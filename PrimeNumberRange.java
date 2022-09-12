package logicalpgm;

import java.util.Scanner;

public class PrimeNumberRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter last number");
		int b=sc.nextInt();
		int temp=0;
		System.out.println("Prime Number between "+a+" to "+b+ " is :");
		for(int i=2;i<=b;i++)				
		{
			for(int j=2;j<=i-1;j++)			
			{
				if(i%j==0)
				{
					temp=temp+1;
					break;
				}
			}
			
			if(temp==0)
			{
				System.out.print(i+" ");
			}
			else
			{
				temp=0;
			}
		}
		
		
		
	}
}
