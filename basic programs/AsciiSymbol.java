import java.util.Scanner;
class AsciiSymbol
{
  public static void main(String []ar)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER ANY ASCII VALUE");
   byte a =sc.nextByte();
   char b = (char)a;
   System.out.println("its Alphabet is:"+b);
   }
}