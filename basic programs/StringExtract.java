import java.util.Scanner;
class StringExtract
{
	public static void main(String []ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		char ch[] = name.toCharArray();
		System.out.println("enter the seed value");
		int a =sc.nextInt();
		System.out.println("enter the extracting value");
	    int b =sc.nextInt();
	    char str[] = new char[b];
	    int j=0;
	    for(int i=a-1;i<a+b-1;i++)
	    {
	    	str[j]=ch[i];
	    	j++;
	    }
         System.out.println("extracting value:"+str);

	}
}