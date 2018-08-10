import java.util.Scanner;
class Read
{
    public static void main(String []ar)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any name:");
	 char ch = sc.next().charAt(0);
	 byte a =(byte)ch;//explict type casting
	 System.out.println("FIRST CHARACTER OF NAME IS:"+a);
     }
}