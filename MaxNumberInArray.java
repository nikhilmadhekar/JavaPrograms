package logicalpgm;

public class MaxNumberInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {10,40,30,100,20};
		System.out.print("Elements are : ");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		int max=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Element is : "+max);
	}
}
