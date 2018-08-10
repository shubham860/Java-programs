import java.io.*;
import java.util.Scanner;
class FileProperties
{
	public static void main(String []ar)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter file name");
			String name = sc.nextLine();
			File f = new File(name);
			if(f.exists())
			{
				System.out.println("File name\t"+f.getName());
				System.out.println("File path\t"+f.getPath());
				System.out.println("File size in bytes\t"+f.length());
				System.out.println("File check\t"+f.isFile());
				System.out.println("Folder check\t"+f.isDirectory());
			}
			else
				System.out.println("Invalid File or Path");
		}
		catch(Exception ex)
		{
			System.out.println("Error "+ex);
		}
	}
}