import java.util.Scanner;
class Hcf
{  public static int method(int a,int b)
    {  int hcf =0;
	for(int i=a;i>=1;i--)
	   {
	     if(a%i==0 && b%i==0)
		  {
		    hcf = i;
			 break; 
		  }
	   }
	    return(hcf);
	}
   public static void main(String []ar)
  {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter two numbers whose GCD have to find ?");
  int a= sc.nextInt();
  int b= sc.nextInt();
   method(a,b);
   System.out.println("HCF is :"+method(a,b));
   }
}   