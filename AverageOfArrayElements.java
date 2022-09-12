package logicalpgm;

import java.util.Scanner;

public class AverageOfArrayElements 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		
		float total=0;
		
		int[] array=new int[n];
		
		System.out.println("Enter the numbers one by one ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.print("Array Elements is : ");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<array.length;i++)
		{
			total=total+array[i];
		}
		
		
		float avg=total/n;
		System.out.println("Average is : "+avg);
	}
}
