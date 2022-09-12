package logicalpgm;

import java.util.Scanner;

public class primenumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//int temp=0;
		boolean flag=false;
		System.out.println("Enter the number to check prime or not");
		int no=sc.nextInt();
		
		for(int i=2;i<=no-1;i++)//for(i=2;2<=6)		//for(i=3;3<=6)		//for(i=4;4<=6)		//for(i=5;5<=6)		//for(i=6;6<=6)		
		{
			if(no%i==0)			//if(7%2)=1==0		//if(7%3)=1==0		//if(7%4)=1==0		//if(7%5)=1==0		//if(7%6)=1==0
			{
				//temp++;
				flag=true;
			}
		}
		//if(temp>0)
		if(flag)
		{
			System.out.println("the given number is not prime");
		}
		else
		{
			System.out.println("the given number is prime");
		}
		//main(null);	
	}
}
