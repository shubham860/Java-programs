import java.util.Scanner;
import java.io.*;
class FileTransferV2
{
	public static void main(String []ar)
	{
     try{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("ENTER FILE NAME U WANT TO READ");
	  String name = sc.nextLine();
	  System.out.println("ENTER FILE NAME U WANT WRITE");
	  String name2 = sc.nextLine();
	  File f = new File(name2);
	  FileInputStream fis = new FileInputStream(name);
	  BufferedInputStream bis = new BufferedInputStream(fis);
	  FileOutputStream fos = new FileOutputStream(name2);
	  BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
	  int a;
	  long t1 = System.currentTimeMillis();
      while((a = bis.read())!= -1)
      {
      	//fos.write(a);
      	bos.write(a);
      }
   /* bis.close();
    bos.close();
    fos.close();
    fis.close();
    sc.close();*/
      long t2 = System.currentTimeMillis();
      System.out.println("file Size= "+f.length()+" bytes");
      System.out.println("TIMETAKEN="+"\t"+(t2-t1)+"\t"+"MILLISEC");
      double speed = f.length()/((t2-t1)*1.024*1024);
	  System.out.println("Transfer Rate "+speed+" MBPS");
	   }
	  catch(Exception ex)
	  {
	  	 System.out.println("Error:"+ex);
	  }
	}
}