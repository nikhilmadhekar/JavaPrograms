package logicalpgm;

public class SumOfArray 
{
	public static void main(String[] args) 
	{
		int a[]= {10,5,20,4,22};
		System.out.print("Elements are : ");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		
		int sum=0;
		/*for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}*/
		
		//Enhanced for loop/for each loop
		for(int value:a)		//for(value:10) 10 is assign to value
		{
			sum=sum+value;
		}
		
		System.out.println("Sum of Array Elements is : "+sum);
		
		
	}
}
