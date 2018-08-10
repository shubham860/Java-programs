import java.util.Scanner;
class ThreeMax
{   public static int maximum(int a,int b,int c)
   {
	 if(a>b && a<c || a>c && a<b)
	 {
		return(a); 
	 }
     else
	 if(b> c&& b<a || b>a && b<c)
	 {
		return(b); 
	 }
     else
       return(c);		 
   }
    public static void main(String []ar)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter three numbers");
     int a = sc.nextInt();
	 int b = sc.nextInt();
	 int c = sc.nextInt();
	 int d = maximum(a,b,c);
	 System.out.println("second maximum is:"+d);  
   }
}