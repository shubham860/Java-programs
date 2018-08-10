import java.util.Scanner;
import java.io.*;
class FileWrite
{
	public static void main(String ar[])
	{
	try{
	     Scanner sc = new Scanner(System.in);
	     System.out.println("ENTER FILE NAME WITH EXTENSION");
	     String file_name = sc.nextLine();
	     DataInputStream dis = new DataInputStream(System.in);
	     FileOutputStream fos = new FileOutputStream(file_name,true); //true is used to append the file(aage sy likne k liye)
	     System.out.println("WRITE YOUR FILE");
	     System.out.println("PRESS ~ FOR END..");
	     char ch;
	     while((ch=(char)dis.read())!='~')
	     {
	     	fos.write(ch);
	      }
   System.out.println("WRITING COMPLETED......");

	     sc.close();
	     fos.close();
	     dis.close();
       }
     catch(Exception ex)
     {
     	System.out.println("ERROR"+ex);
     }
	}
} 