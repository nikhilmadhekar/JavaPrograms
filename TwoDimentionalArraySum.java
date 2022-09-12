package logicalpgm;

import java.util.Scanner;

public class TwoDimentionalArraySum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int[][] a=new int[3][2];
		
		//given input number from user
		for(int i=0;i<3;i++)								//i=0							//i=1							//i=2							//i=3 condition false
		{
			for(int j=0;j<a[i].length;j++)					//j=0			j=1				//j=0			j=1				//j=0			j=1
			{
				System.out.println("Enter the number");		//10			20				//30			40				//50			//60
				a[i][j]=sc.nextInt();						//a[0][0]=10	a[0][1]=20		//a[1][0]=30	a[1][1]=40		//a[2][0]=50	a[2][1]=60
			}
		}
		
		
		//display contents of 2d array							//i=>
		System.out.println("Elements are :");				//	0		1
		for(int i=0;i<3;i++)						//j	//	0	10		20
		{												//	1	30		40
			for(int j=0;j<a[i].length;j++)				//	2	50		60			
			{
				System.out.print(a[i][j]+"\t");				
			}
			System.out.println(" ");
		}
		
		
		
		//int sum=0; for all array sum
		//calculates sum of each row of given matrix
		for(int i=0;i<3;i++)						//j									1.i=0															2.i=1														3.i=2							
		{									//i		0	1								
			int sumRow=0;//for each row sum //0		10	20								1.sumOfRow=0			sumofRow=10				sumOfRow=30		2.sumOfRow=0			sumOfRow=30			sumOfRow=70		3.sumOfRow=0			sumOfRow=50				sumOfRow=110
			for(int j=0;j<a[i].length;j++)	//1		30	40								1. j=0					j=1										2.j=0					j=1									3.j=0					j=1
			{								//2		50	60								1.sumOfRow=0+10=10		sumOfRow=10+20=30						2.sumOfRow=0+30=30		sumOfRow=30+40=70					3.sumOfRow=0+50=50		sumOfRow=50+60+110
				sumRow=sumRow+a[i][j];
			}
			System.out.println("Row "+(i+1)+" sum is : "+sumRow);//sum of each row		1.Row 1 sum is : 30		2.Row 2 sum is : 70		3.Row 3 sum is : 110
		}
		//System.out.println("Sum of all rows : "+sum);
		
		
		
		
		//calculates sum of each column of given matrix
		for(int i=0;i<2;i++)						//i			1.i=0																		2.i=1
		{									//j		0	1
			int sumCol=0;					//0		10	20		1.sum0fCol=0		sumOfCol=10			sumOfCol=40			sumOfCol=90		2.sumOfCol=0			sumOfCol=20				sumOfCol=60				sumOfCol=120
			for(int j=0;j<3;j++)			//1		30	40		1.j=0				j=1					j=2									2.j=0					j=1						j=2
			{								//2		50	60		1.sumCol=0+10=10	sumOfCol=10+30=40	sumOfCol=40+50=90					2.sumOfCol=0+20=20		sumOfCol=20+40=60		sumOfCol=60+60=120
				sumCol=sumCol+a[j][i];
			}
			System.out.println("Column "+(i+1)+" sum is : "+sumCol);//	1.Column 1 sum is : 90		2.Column 2 sum is : 120
		}
		
		//sum of all elements
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println("Sum of all elements are : "+sum);
	}
}
