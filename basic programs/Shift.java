import java.util.Scanner;
class Shift
{   public static char change(char ch)
   {
	 if(ch>='a' && ch<='z')
	 {
		 int b = (int)ch-32;//implict type casting
		return((char)b); 
	 }
     else
	 if(ch>='A' && ch<='Z')
	 {
       int b = (int)ch+32;//implict type casting
		return((char)b); 	 
	 }
     else
       return(ch);		 
   }
    public static void main(String []ar)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the name");
	  char ch = sc.next().charAt(0);  
	  System.out.println("after changing:"+change(ch));  
   }
}