import java.util.Scanner;
class RemoveString
{
	public static char[] remove(char a[])
	{    int count=0;
	  for(int i=0;i<a.length;i++)
	  {
	  	if((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z'))
          {
             count++;
          }
	  }
	    int j=0;
	  char b[] = new char[count];
	  for(int i=0;i<a.length;i++)
	  {
        if((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z'))
          {
             b[j]=a[i];
               j++;
          }
	  } return(b);
	}


	public static void main(String []ar)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter name with special character");
		String name = sc.nextLine();
		char a[] = name.toCharArray();
		System.out.println(remove(a));
	}
}