import java.util.Scanner;
class Operations
{ 
  public static int sum(int a,int b)
     {
     return(a+b);
     }
  public static float avg(int a,int b)
	 {
	 return((a+b)/2.0f);
	 }
  public static void main(String []ar)
     {  int a,b,c;
	    float d; 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("ENTER TWO NUMBERS");
	 a=sc.nextInt(); 
	 b=sc.nextInt();
	 c=sum(a,b);
	 d=avg(a,b);
	  System.out.println("SUM="+c);
	  System.out.println("AVG="+d); 
	   }
} 