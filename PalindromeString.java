package logicalpgm;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.next();
		
		String org_str=str;
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String is : "+rev);
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" String is Palindrome String");
		}
		else
		{
			System.out.println(org_str+" String is Not Palindrome String");
		}
	}
}
