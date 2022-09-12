package logicalpgm;

import java.util.Scanner;

public class JaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][];
		int noOfColumns;
		
		for(int i=0;i<3;i++)
		{
			System.out.println("how many columns in row "+(i+1));
			noOfColumns=sc.nextInt();
			a[i]=new int[noOfColumns];
			
			for(int j=0;j<noOfColumns;j++)
			{
				System.out.println("Enter the number : ");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Elements are : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
}
