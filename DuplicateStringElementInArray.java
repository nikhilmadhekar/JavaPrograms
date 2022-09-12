package logicalpgm;

public class DuplicateStringElementInArray 
{
	public static void main(String[] args) 
	{
		String a[]= {"java","c","c++","python","java","c"};
		System.out.print("String Elements are : ");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		boolean flag=false;
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Dulpicate element found : "+a[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}
	}
}
