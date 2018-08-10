import java.util.Scanner;
class Power
{
  public static int pow(int b,int e)
  {      int p=1;
     for(int i=1;i<=e;i++)
	 {
	    p=p*b;
	 }
       return(p);
  }
  public static void main(String []ar)
  {  
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the value of base and exponient");
      int b= sc.nextInt();
	  int e= sc.nextInt();
     System.out.println("solution="+pow(b,e));
  }
}
