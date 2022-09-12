package logicalpgm;
import java.util.*;
public class Frequency1 
{
	public static void main(String[] args) 
	{
		  // Let us create an array of integers
        int arr[] = {10, 20, 20, 30, 20, 40, 50};
   
       
        System.out.println("Frequency of number 10 is : "+Collections.frequency(Arrays.asList(arr), 10));
        System.out.println("Frequency of number 20 is : "+Collections.frequency(Arrays.asList(arr), 20));
        System.out.println("Frequency of number 30 is : "+Collections.frequency(Arrays.asList(arr), 30));
        System.out.println("Frequency of number 40 is : "+Collections.frequency(Arrays.asList(arr), 40));
        System.out.println("Frequency of number 50 is : "+Collections.frequency(Arrays.asList(arr), 50));
   
        
	}
}
