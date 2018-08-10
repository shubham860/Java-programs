import java.util.Scanner;
class Upper
{
  public static char upcase(char a)
  {
   int b=(int)a;//explict type casting
   b = (b-32);
   return((char)b);
  }
  public static void main(String []ar)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter any name");
   char a =sc.next().charAt(0);
   char ch=upcase(a);
 System.out.println("uppercase:"+ch);
  }
} 

class Lower
{
  public static char lwcase(char a)
  {
   int b=(int)a;//explict type casting
   b = (b+32);
   return((char)b);
  }
  public static void main(String []ar)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter any name");
   char a =sc.next().charAt(0);
    char ch=lwcase(a);
   System.out.println("lowercase:"+ch);
  }
} 