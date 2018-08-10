import java.util.Scanner;
class Checks
{   public static char change(char ch)
   {
	 if(ch>'a' && ch<'z')
	 {System.out.println("character is lowercase");
		return(ch); 
	 }
     else
	 if(ch>'A' && ch<'Z')
	 {System.out.println("character is uppercase");
		return(ch); 	 
	 }
     else
	if(ch>'0' && ch<'9')
	{	System.out.println("character is number"); 
       return(ch);
	}   
	else 
     System.out.println("character is symbol");
       return(ch);	 
   }
    public static void main(String []ar)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the character");
	  char ch = sc.next().charAt(0); 
	 change(ch); 
   }
}