import java.net.*;
import java.util.Scanner;
class Myip
{
	public static void main(String []ar)
	{
		try{
		     Scanner sc = new Scanner(System.in);
		     System.out.print("enter website name:");
		     String name = sc.nextLine();
		     System.out.println("IP ADDRESS IS:"+InetAddress.getByName(name));
		   }
		catch(Exception ex)
	       {  
			 System.out.println("Error:"+ex);
		   }   

	}
}