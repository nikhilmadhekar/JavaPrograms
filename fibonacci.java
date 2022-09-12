package logicalpgm;

import java.util.Scanner;

public class fibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci Series");
		System.out.println("Enter number of terms");
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		int sum;
		
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n-2;i++)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		System.out.println();
		//main(null);
	}
}
