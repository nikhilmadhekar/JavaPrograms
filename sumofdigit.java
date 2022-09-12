package logicalpgm;

import java.util.Scanner;

public class sumofdigit 
/*{	
	public static void main(String[] args) 
	{
		int rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		while(num>0) //while(541>0) //while(54>0) //while(5>0)	//while(0>0)condition false
		{
			rem=num%10; //541%10=1  rem=1  //rem=54%10=4 rem=4	//rem=5%10; rem=5
			sum=sum+rem;	//sum=0+1; sum=1	//sum=1+4; sum=5	//sum=5+5 sum=10(display)
			num=num/10;	//num=541/10; num=54	//num=54/10=5	//num=5/10=0
		}
		System.out.println(sum);
	}
	

}*/
{
	public static void main(String[] args) 
	{
		int rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}