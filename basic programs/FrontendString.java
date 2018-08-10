import java.util.Scanner;
class FrontendString
{
	public static void main(String []ar)
	{  char ch;
		Scanner sc = new Scanner(System.in);
		do{
            System.out.println("enter the name");
            String name = sc.nextLine();
            char a[] = name.toCharArray();
          
           System.out.println("PRESS 1 TO REMOVE SPECIAL CHARACTER FORM STRING ?");
		   System.out.println("PRESS 2 TO CHECK FREQUENCY OF ALPHABET IN A STRING ?");
		   System.out.println("PRESS 3 TO CHECK STRING IS PALINDROME OR NOT ?");
		   int l=sc.nextInt();

		   switch(l)
		    {
              
              case 1:  System.out.println(Backend.remove(a));
                         break;

              case 2:  Backend.frequency(a);
                        break;

              case 3: if(Backend.palindrome(a)) 
                      System.out.println("STRING IS PALINDROME");
                      else
                      System.out.println("STRING IS NOT PALINDROME");
                          break;

              default: System.out.println("INVALID INPUT");    
		    }
		  
               System.out.println("DO YOU WANT TO CONTINUE ?");
               ch = sc.next().charAt(0);

		  }
		  while(ch=='y' || ch=='Y');
	}
} 