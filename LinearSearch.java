package logicalpgm;
import java.util.*;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,40,50,30};	//5
		
		int search_element=50;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.print(a[i]+" ");
			if(a[i]==search_element)
			{
				System.out.println("Element is found at index "+i);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
		System.out.println("Element not found");
		}
	}
}
