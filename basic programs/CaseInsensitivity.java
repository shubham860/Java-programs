import java.util.Scanner;
class CaseInsensitivity
{
	public static boolean check(char a[],char b[])
	{
		for(int i=0;i<=a.length;i++)
		{
		    if((a[i]>='a'&&a[i]<='z') || (b[i]>='a'&&b[i]<='z') || (a[i]>='A'&&a[i]<='Z') || (b[i]>='A'&&b[i]<='Z'))
			{
				if(a[i]!=b[i])
				{
					return(false);
				}
		
            }

		}return(true);
	}

	public static void main(String []ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name");
		String name = sc.nextLine();
		char a[] = name.toCharArray();
		System.out.println("enter the second name");
		String name2 = sc.nextLine();
		char b[] = name2.toCharArray();
		if(check(a,b))
			System.out.println("equal");
		else
			System.out.println("not equal");
	}

		
}