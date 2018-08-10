import java.util.Scanner;
class ReplaceWord
{
	public static char[] replace(char a[], char b[], char c[])
	{    
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[0]) 
			{
				a[i]=c[0];
			}
		} return(a);
	}

	public static void main(String []ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name");
		String name = sc.nextLine();
		char a[] = name.toCharArray();
		System.out.println("enter old character");
		String old = sc.nextLine();
		char b[] = old.toCharArray();
		System.out.println("enter new character");
		String new_word = sc.nextLine();
		char c[] = new_word.toCharArray();
		System.out.println(replace(a,b,c));
		
	}

}