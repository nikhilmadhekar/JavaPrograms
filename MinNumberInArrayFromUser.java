package logicalpgm;
import java.util.*;
public class MinNumberInArrayFromUser
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
		
		
		
		
		//creates an array in the memory of length 10  
		int[] a = new int[5];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<a.length; i++)  
		{  
		//reading array elements from the user   
		a[i]=sc.nextInt();  
		}  
		
		
		System.out.print("Array elements are: ");  
		// accessing array elements using the for loop  
		for (int i=0; i<a.length; i++)   
		{  
		System.out.print(a[i]+" ");  
		} 
		System.out.println(" ");
		
		
		
		int min=a[0];	
		for(int i=1;i<a.length;i++)	
		{
			if(a[i]<min)				
			{
				min=a[i];					
			}
		}
		System.out.println("Minimum element in array is : "+min); 
	}
}
