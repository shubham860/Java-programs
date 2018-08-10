import java.util.Scanner;
class Prime
{   public static boolean check(int a)
   {   int i=1;
	 for(i=2;i<=a/2;i++)
     {
		 if(a%i==0)
		return(false);
	 }
			return(true);
	}		 
   
    public static void main(String []ar)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a number to check prime or not");
	   int a = sc.nextInt();
	 check(a);
	 if(check(a))
  System.out.println("number is prime");	 
   else
	   System.out.println("number is not prime");
   }
}