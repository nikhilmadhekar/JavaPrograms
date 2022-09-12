package logicalpgm;

public class RemoveBlankSpace 
{
	public static void main(String[] args) 
	{
		String str="JBKJ";
		//String trim= str.trim();
		//System.out.println(trim); //trim() method its remove starting string and ending string blank spaces
		str=str.replaceAll("J", "A");
		System.out.println(str);
	}
}
