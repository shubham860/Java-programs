import java.util.Scanner;
import java.io.*;
class ExtractFiles
{
	public static void main(String []ar)
	{
	  try{	
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the name of folder");
	   String name = sc.nextLine();
	   File f = new File(name);
       if(f.exists())
       {
       	String []str = f.list();//to extract files from folder
       int a = str.length;
       System.out.println("NO. OF FILES :"+a);
       for(String s:str)
       
       	System.out.println(s);
       
       }
       else
       	System.out.println("INVALID FILE OR PATH");
         }
       catch(Exception ex)
       {
       	System.out.println("Error:"+ex);
       }  
	}
}