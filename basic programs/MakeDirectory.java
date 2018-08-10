import java.util.Scanner;
import java.io.*;
class MakeDirectory
{
	public static void main(String []ar)
	{
		try{
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE NAME OF FOLDER");
            String name = sc.nextLine();
            File f = new File(name);
            if(!f.exists())
             f.mkdir();
           System.out.println("ENTER THE NAME OF FILE");
           String fname = sc.nextLine();
           String path  = name+"\\"+fname;
           System.out.println("STRATING WRITING...");
           System.out.println("PRESS ~ TO END");
           DataInputStream dis = new DataInputStream(System.in);
           FileOutputStream fos= new FileOutputStream(path);
           char ch;
           while((ch = (char)dis.read())!= '~')
                fos.write(ch);
            System.out.println("WRITING COMPLETED..");
               dis.close();
               fos.close();
               sc.close();
            System.out.println("FILE SAVED AT PATH:"+path);
           }
          catch(Exception ex)
          {
          	System.out.println("ERROR:"+ex);
          }
	}       	
}