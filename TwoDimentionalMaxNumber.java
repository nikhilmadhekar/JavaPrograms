package logicalpgm;

import java.util.Scanner;

public class TwoDimentionalMaxNumber 
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
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		//max number from each row
		int max;
		for(int i=0;i<3;i++)
		{
			max=a[i][0];
			for(int j=1;j<2;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
					
				}
				System.out.println("Row "+(i+1)+" Maximum number is : "+max);
			}
		}
		
		//max number from each column
		int maxi;
		for(int i=0;i<2;i++)
		{
			maxi=a[0][i];
			for(int j=1;j<3;j++)
			{
				if(a[j][i]>maxi)
				{
					maxi=a[j][i];
				}
			}
			System.out.println("Column "+(i+1)+" maximum number is : "+maxi);
		}
		
		//maximum number from all elements
		int maximum=a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(a[i][j]>maximum)
				{
					maximum=a[i][j];
				}
			}
		}
		System.out.println("Maximum number from all elements : "+maximum);
	}
}
