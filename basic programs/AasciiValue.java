import java.util.Scanner;
class AasciiValue
{
  public static void main(String []ar)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER ANY ALPHABET");
   char a =sc.next().charAt(0);
   byte b = (byte)a;
   System.out.println("its Ascii value is:"+b);
   }
}