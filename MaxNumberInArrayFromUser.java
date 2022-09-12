package logicalpgm;
import java.util.*;
public class MaxNumberInArrayFromUser
{
	public static void main(String[] args) 
	{
		/*int a[]= {50,100,40,60,20};
		System.out.print("Elements is : ");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");*/
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		
		//reading the number of elements from the that we want to enter  
		int n=sc.nextInt();  
		
		
		//creates an array in the memory of length 10  
		int[] a = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<=n-1; i++)  
		{  
		//reading array elements from the user   
		a[i]=sc.nextInt();  
		}  
		
		
		System.out.print("Array elements are: ");  
		// accessing array elements using the for loop  
		for (int i=0; i<=n-1; i++)   
		{  
		System.out.print(a[i]+" ");  
		} 
		System.out.println(" ");
		
		
		
		int max=a[0];	
		for(int i=1;i<=a.length-1;i++)	
		{
			if(a[i]>max)				
			{
				max=a[i];				
			}
		}
		System.out.println("Maximum element in array is : "+max); 
	}
}
