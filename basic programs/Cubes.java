import java.util.Scanner;
class Cubes
{ 
  public static int cube(int a)  
     {
     return(a*a*a);
     }
   public static void main(String []ar)
     {  int a,b;
	Scanner sc = new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER");
	 a=sc.nextInt(); 
	 b=cube(a);
	 System.out.println("cube :"+b);
	  }
}