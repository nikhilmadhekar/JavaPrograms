package logicalpgm;
import java.util.*;
public class Frequency 
{
	public static void main(String[] args)
	{
	        
	        ArrayList<String> list =new ArrayList<String>();
	        list.add("code");
	        list.add("code");
	        list.add("quiz");
	        list.add("code");
	      
	        // count the frequency of the word "code" and "quiz"
	        System.out.println("The frequency of the word code is: "+Collections.frequency(list, "code"));
	        System.out.println("The frequency of the word quiz is: "+Collections.frequency(list, "quiz")); 
	 }
}

