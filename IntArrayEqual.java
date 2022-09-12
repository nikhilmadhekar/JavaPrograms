package logicalpgm;

import java.util.Arrays;

public class IntArrayEqual 
{
	public static void main(String[] args) 
	/*{
		int arr1[]= {10,20,30};
		int arr2[]= {10,20,30};
	
		if(arr1.equals(arr2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("not same");
		}
	}	*/
	{
		int[] arr1= {10,20,30};
		int[] arr2= {10,20,30};
		//System.out.println(arr1.getClass().getName());
		//System.out.println(arr2.getClass().getName());
		
		//System.out.println(arr1==arr2);	//address are compared //false
		//System.out.println(arr1.equals(arr2));//addresses are compared as object equals() is called //false
		
		//Arrays.toString() gives content of an array in string format
		String firstArrayContens= Arrays.toString(arr1);
		String secondArrayContents= Arrays.toString(arr2);
		
		System.out.println(firstArrayContens);
		System.out.println(secondArrayContents);
		
		System.out.println(firstArrayContens.equals(secondArrayContents));
	}
}
