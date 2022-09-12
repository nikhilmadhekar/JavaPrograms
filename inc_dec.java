package logicalpgm;

public class inc_dec 
{
	public static void main(String[] args) 
	{
		/*int a=10;
		int c=++a;	//11 a=11
		int b=++a;	//12 a=12
		int d=a--;	//12 a=11
		int y=++a;	//12 a=12
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(d);
		System.out.println(y);*/
		
		int a=0;
		int b=a++;	//0 a=1
		int c=a--;	//1 a=0
		
		c=a++;	//0 a=1
		b=a++;	//1 a=2
		a=a--;	//2 a=1
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
