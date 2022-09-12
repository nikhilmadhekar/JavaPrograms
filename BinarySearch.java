package logicalpgm;

import java.util.Scanner;

/*public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60,70,80,90,100}; //should be in sorted array
		boolean flag=false;
		
		int search_element=55;
		
		int low=0;
		int highest=a.length-1;
		
		while(low<=highest)
		{
			int mid=(low+highest)/2;
			
			if(search_element==a[mid])
			{
				System.out.println("element found at index "+mid);
				flag=true;
				break;
			}
			if(search_element>a[mid])
			{
				low=mid+1;
			}
			
			if(search_element<a[mid])
			{
				highest=mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Elements not found");
		}
	}
}
			
*/
public class BinarySearch
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
//		int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter the elements one by one");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.print("Elements are : ");
		for(int i=0;i<a.length;i++)
		{	
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.println("enter element number to be search");
		int search_element=sc.nextInt();
		boolean flag=false;
		
		int low=0;
		int highest=a.length-1;
		
		while(low<=highest)
		{
			int mid=(low+highest)/2;
			
			if(search_element==a[mid])
			{
				System.out.println("Element found at index at "+mid);
				flag=true;
				break;
			}
			if(search_element<a[mid])
			{
				highest=mid-1;
			}
			if(search_element>a[mid])
			{
				low=mid+1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		
	}
}