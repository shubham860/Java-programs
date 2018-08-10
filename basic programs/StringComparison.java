import java.util.Scanner;
class StringComparison
{
	public static void main(String []ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name"); 
		String name = sc.nextLine();
		char a[] = name.toCharArray();
		System.out.println("enter the second first name");
		String name2 = sc.nextLine();
		char b[] = name2 .toCharArray();
              int flag=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]!=b[i])
				{
					flag = 1;
					break;
				}
			
		}
		    if(flag==1)
		      {
		       System.out.println("names are not equal");
		      }
            else
               System.out.println("names are equal");

	}
}