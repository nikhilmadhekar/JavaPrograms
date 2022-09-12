package logicalpgm;

import java.util.Scanner;

public class bubblesort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter total how many numbers you have to store");
		int no=sc.nextInt();
		
		int[] a=new int[no];
		
		System.out.println("Enter the numbers");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("Before sorting : ");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++)		//number of passes
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("After sorting : ");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
