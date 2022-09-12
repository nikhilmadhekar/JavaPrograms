package logicalpgm;
import java.util.*;

public class CheckVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check vowel present or not");
		String s=sc.nextLine();
		boolean isFound=false;
		int count=0;
		for(int index=0;index<=s.length()-1;index++)
		{
			
			char c = s.charAt(index);
			//if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
				if(c == 97|| c == 101|| c == 105|| c == 111|| c == 117 ||c == 65|| c == 69|| c == 73|| c == 79|| c == 85 )
			{
					isFound=true;
					count++;
					//break;
					
			}
		}
			
			
		if(isFound)
		{
				System.out.println("Vowel is Present");
				System.out.println("Total number of vowel count : "+count);
		}
			
		else
		{
				System.out.println("Vowel not present");
		}
		
	}
}
