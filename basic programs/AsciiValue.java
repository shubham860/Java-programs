import java.util.Scanner;
class AsciiValue
{
  public static byte ascii (char a)  
     {
		 byte b = (byte)a;//explict type casting
     return(b);
	  }
   public static void main(String []ar)
     {  
	Scanner sc = new Scanner(System.in);
	 System.out.println("ENTER A ALPHABET");
      char a =sc.next().charAt(0); 
 System.out.println("ASCII VALUE IS"+ascii(a));
	  }
}