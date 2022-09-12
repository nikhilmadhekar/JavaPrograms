package logicalpgm;

public class MinNumberInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {20,12,23,2,10};
		System.out.print("Elements are : ");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		
		int min=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum number is : "+min);
	}
}
