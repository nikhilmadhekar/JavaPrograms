package logicalpgm;
import java.util.Arrays;

public class SecondLargestNumber 
{
	public static void main(String[] args) 
	{
		int a[]= {1,20,5,6,16,10};
		
		Arrays.sort(a);
		
		
		System.out.println("First Highest Element in the array = "+a[a.length-1]);
		System.out.println("Second Highest Element in the array = "+a[a.length-2]);
	}
}
