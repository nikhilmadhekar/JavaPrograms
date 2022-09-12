package logicalpgm;

import java.util.Scanner;

public class OddEven 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//int a[]= {20,2,3,57,89,60};
		System.out.println("How many numbers in array to check odd and even");
		int n=sc.nextInt();
		
		
		int[] a=new int[6];
		System.out.println("Enter a numbers to check whose number is odd and even");
		for(int i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]+" is even number");
			else
				System.out.println(a[i]+" is odd number");
		}
	}
}
