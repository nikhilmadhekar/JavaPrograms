package logicalpgm;
import java.util.*;

public class SumOfArrayFromUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element do you want to store");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.print("Enter elements : ");
		for(int i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(" ");
		
		System.out.print("Elements are : ");
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		
		int sum=0;
		for(int i=0;i<=n-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array elements is : "+sum);
		
	}
}
