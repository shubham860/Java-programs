import java.util.Scanner;
import java.io.*;
class FileTransferV1
{
	public static void main(String []ar)
	{
     try{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("ENTER FILE NAME U WANT TO READ");
	  String name = sc.nextLine();
	  System.out.println("ENTER FILE NAME U WANT WRITE");
	  String name2 = sc.nextLine();
	  FileInputStream fis = new FileInputStream(name);
	  FileOutputStream fos = new FileOutputStream(name2);
	  int a;
	  long t1 = System.currentTimeMillis();
      while((a = fis.read())!= -1)
      	fos.write((char)a);//for textfiles and message a is converted into char
      fos.close();
      fis.close();
      sc.close();
      long t2 = System.currentTimeMillis();
      System.out.println("TIMETAKEN="+"\t"+(t2-t1)+"\t"+"MILLISEC");
	   }
	  catch(Exception ex)
	  {
	  	 System.out.println("Error:"+ex);
	  }
	}
}