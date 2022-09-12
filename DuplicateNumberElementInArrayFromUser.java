package logicalpgm;

import java.util.Scanner;

public class DuplicateNumberElementInArrayFromUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements you want to store : ");
		int n=sc.nextInt();
		
		int[] a=new int[10];
		System.out.println("Enter the elements :");
		for(int i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("Elements are : ");
		for(int i=0;i<=n-1;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println(" ");
		boolean flag=false;
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate element number are found : "+a[i]);
					flag=true;
				}
			}
		}
		if(flag=false)
		{
			System.out.println("Duplicate element not found");
		}
		
	}
}
