package logicalpgm;

import java.util.Scanner;

public class armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sumOfCube=0,a,temp;
		temp=num; //temp=370
		
		while(num>0) //while(370>0) //while(37>0)	//while(3>0)	//while(0>0)condition false
		{
			a=num%10;	//a=370%10=0;	//a=37%10=7;	//a=3%10=3;
			num=num/10;	//num=370/10=37;	//num=37/10=3;	//num=3/10=0;
			sumOfCube=sumOfCube+(a*a*a);	//sumOfCube=0+(0*0*0)=0;	//sumOfCube=0+(7*7*7)=343;	//sumOfCube=343+(3*3*3)=343+27=370;
		}
		if(temp==sumOfCube)	//if(370==370)
		{
			System.out.println(temp+" is an armstrong number");
		}
		else
		{
			System.out.println(temp+" is not an armstrong number");
		}
	}
}
