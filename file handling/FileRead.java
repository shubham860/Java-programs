import java.util.Scanner;
import java.io.*;
class FileRead
{
	public static void main(String []ar)
	{
		try{
             Scanner sc = new Scanner(System.in);
             System.out.println("ENTER FILE NAME OR PATH");
             String file_name = sc.nextLine();
             FileInputStream fis = new FileInputStream(file_name);
              int a;
             while ((a = fis.read()) != -1)
             System.out.print((char)a); 
             fis.close();
             sc.close();
	       }
	    catch(Exception ex)
	       {
	    	System.out.println("ERROR"+ex);
	       }   
	}   
}