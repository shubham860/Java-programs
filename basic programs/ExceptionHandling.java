import java.io.*;
class ExceptionHandling
{
	public static void main(String []ar)
	{
	 try{ 
	      InputStreamReader isr = new InputStreamReader(System.in);
		  BufferedReader br = new BufferedReader(isr);
		  System.out.println("enter two number");
          int a = Integer.parseInt(br.readLine());
          int b = Integer.parseInt(br.readLine());
          int c = a+b;
          System.out.println("add is:"+c);   
	    }
	 catch(Exception ex)
	    {
	 	System.out.println(ex);
	    }
	 finally
	    {
	 	System.out.println("Finally block executed");
	    }
    }
}    