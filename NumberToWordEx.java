package logicalpgm;

import java.util.Scanner;

public class NumberToWordEx 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number(3 digit number)");
		int n=sc.nextInt();
		
		if(n<0 || n>999)
		{
			System.out.println("Wrong input");
		}
		else
		{
			int a=n%10;	//last digit		a=457%10=7
			int b=n/10;	//					b=547/10=45
			int c=b%10;//second last digit	c=45%10=5
			int d=n/100;//first digit		d=457/100=4
			String arr[]= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
			String arr1[]= {" "," Ten"," Twenty"," Thirty"," Fourty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
			String p=" Hundred";
			String q=" Only";
			
			
			if(n<20)
			{
				System.out.println(arr[n]+q);	//arr[10];
			}
			else if(n<100)
			{
				System.out.println(arr1[c]+arr[a]+q);	//99	arr1[9]+arr[9]=NinetyNine
			}
			else
			{
				System.out.println(arr[d]+p+arr1[c]+arr[a]+q);//457	arr[4]+p+arr1[5]+arr[a]=Four Hundred FiftySeven
			}
			
			
		}
	}
}
