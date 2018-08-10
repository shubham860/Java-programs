import java.util.Scanner;
class Factorial
{
  public static int fac(int n)
  {      int f=1;
     for(int i=1;i<=n;i++)
	 {
	    f=f*i;
	 }
       return(f);
  }
  public static void main(String []ar)
  {  
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number to find its factorial");
      int n= sc.nextInt();
     System.out.println("factorial="+fac(n));
  }
}
