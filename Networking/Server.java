import java.io.*;
import java.net.*;
import java.util.Scanner;
class Server
{
	public static void main(String []ar)
	{
		try{
             Scanner sc = new Scanner(System.in);
             ServerSocket ss = new ServerSocket(7575);//port number

             System.out.println("Server Connected !");
             System.out.println("Waiting For Client....");

             Socket s = ss.accept();

             System.out.println("Client Connected");

             PrintStream ps = new PrintStream(s.getOutputStream());
             InputStreamReader isr = new InputStreamReader(s.getInputStream());
             BufferedReader br = new BufferedReader(isr);

             while(true)
              {
                String send,rec;
                while((rec = br.readLine())!= null)
                {
                 System.out.println("Client = "+rec);
                 send = sc.nextLine();
                 ps.println(send);
                }
             ps.close();
             ss.close();
             s.close();
             br.close();
             sc.close();
             System.exit(0);
 		     }
 		    }
 		   catch(Exception ex)
 		   {
 		   System.out.println("Error:"+ex);
 		   }
	}
}
