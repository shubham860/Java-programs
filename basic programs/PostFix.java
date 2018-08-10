import java.util.Scanner;

class PostFix
{
	public static char[] fix(char ch[])
	{   
		char a[] = new char[ch.length];
		char b[] = new char[ch.length];
		
		for(char c:a)
		{
		   System.out.println(c+"\n");
		}
			return(c);
	}
	
	public static void main(String []ar)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nENTER THE INFIX EXPRESSION : ");
		String value = sc.nextLine();
		char ch[] = value.toCharArray();
		
		char d = fix(ch);
		
		
	}
	
	
}