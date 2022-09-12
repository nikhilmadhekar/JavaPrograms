package logicalpgm;

public class StringEquals 
{
	public static void main(String[] args) 
	{
		String s1="JBK";
		String s2="Jbk";
		String s3="JBKKKKK";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.indexOf("BKKK"));
	}
}
