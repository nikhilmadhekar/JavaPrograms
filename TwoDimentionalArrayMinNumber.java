package logicalpgm;

import java.util.Scanner;

public class TwoDimentionalArrayMinNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][2];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("Enter the number : ");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Elements are : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		int min;
		for(int i=0;i<3;i++)
		{
			min=a[i][0];
			for(int j=1;j<2;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
				System.out.println("Row "+(i+1)+" minimum number is : "+min);
			}
		}
		
		int mini;
		for(int i=0;i<2;i++)
		{
			mini=a[0][i];
			for(int j=1;j<3;j++)
			{
				if(a[j][i]<mini)
				{
					mini=a[j][i];
				}
			}
			System.out.println("Column "+(i+1)+" minimum number is : "+mini);
		}
		
		int minimum =a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(a[i][j]<minimum)
				{
					minimum=a[i][j];
				}
			}
		}
		System.out.println("Minimum number from all elements are : "+minimum);
	}
}
