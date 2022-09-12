package logicalpgm;

import java.util.Scanner;

public class MissingNumberInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements to store in array :");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		System.out.print("enter the elements : ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		 System.out.print("Elements are : ");
		 for(int i=0;i<=a.length-1;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println();
		 
		 
		 
		 int sum1=0;
		 for(int i=0;i<=a.length-1;i++)
		 {
			 sum1=sum1+a[i];
		 }
		 System.out.println("Sum of array elements is : "+sum1);
		 
		 
		 
		 int sum2=0;
		 int p=a[0];
		 int q=a[a.length-1];
		 
		 for(int i=p;i<=q;i++)
		 {
			 sum2=sum2+i;
		 }
		 System.out.println("Sum of range of elements in array : "+sum2);
		 
		 System.out.println("Missing Number is : "+(sum2-sum1));
		 
	}
}
