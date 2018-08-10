import java.io.*;
import java.net.*;
import java.util.Scanner;
class Client
{
	public static void main(String []ar)
	{
		try{
               Scanner sc = new Scanner(System.in);
               Socket s = new Socket("127.0.0.1",7575);
               System.out.println("	Client Connected ");

               DataOutputStream dos = new DataOutputStream(s.getOutputStream());
              InputStreamReader isr = new InputStreamReader(s.getInputStream());
             BufferedReader br = new BufferedReader(isr);

             String rec,send;

             while(!(send = sc.nextLine()).equals("bye"))
             {
             	dos.writeBytes(send+"\n");
             	rec = br.readLine();
                System.out.println("Server:"+rec);

             }
             dos.close();
             s.close();
             br.close();
             sc.close();

 		   }

 		   catch(Exception ex)
 		   {
 		   	System.out.println("Error:"+ex);
 		   }
	}
}