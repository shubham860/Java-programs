import java.util.Scanner;
class User
{
  public static void main(String []ar)
   {  char ch;
	 Scanner sc = new Scanner(System.in);
	 do{
	     System.out.println("ENTER A NUMBER");
	     int n = sc.nextInt();
	     System.out.println("PRESS 1 TO CHECK ARMSTRONG NUMBER");
		 System.out.println("PRESS 2 TO CHECK PALINDROME NUMBER");
		 System.out.println("PRESS 3 TO CHECK PERFECT NUMBER");
		 System.out.println("PRESS 4 TO CHECK PERFECT PRIME NUMBER");
		 System.out.println("PRESS 5 TO CHECK SPECIAL NUMBER");
		 System.out.println("PRESS 6 TO CHECK NEON NUMBER");
		 System.out.println("PRESS 7 TO CHECK NIVEN NUMBER");
		 System.out.println("PRESS 8 TO CHECK PRONIC NUMBER");
		 System.out.println("PRESS 9 TO CHECK EVIL NUMBER");
		 System.out.println("PRESS 10 TO CHECK HAPPY NUMBER");
		 int c =sc.nextInt();
		 
		 switch(c)
		  {
			  case 1: if(Numbers.armstrong(n)==n)
				      System.out.println("IT IS A ARMSTRONG NUMBER");
				      else
					  System.out.println("IT IS NOT A ARMSTRONG NUMBER");
				         break;
			         
			  case 2:  if(Numbers.palindrome(n))
				       System.out.println("IT IS A PALINDROME NUMBER");
				       else
					   System.out.println("IT IS NOT A PALINDROME NUMBER");
                          break;				   
			  
			  case 3: if(Numbers.perfect(n)==n)
				      System.out.println("IT IS PERFECT NUMBER");
				      else
					  System.out.println("IT IS NOT A PERFECT NUMBER");
				         break;
						 
			  case 4: if(Numbers.perfect_prime(n)==n)
				      System.out.println("IT IS A PERFECT PRIME NUMBER");
				      else
					  System.out.println("IT IS NOT A PERFECT PRIME NUMBER");
				         break;
						 
			  case 5: if(Numbers.special(n)==n)
				      System.out.println("IT IS A SPECIAL NUMBER");
				      else
					  System.out.println("IT IS NOT A SPECIAL NUMBER");
				         break;
						 
			  case 6: if(Numbers.neon(n)==n)
				      System.out.println("IT IS A NEON NUMBER");
				      else
					  System.out.println("IT IS NOT A NEON NUMBER");
				         break;
						 
			  case 7: if(Numbers.niven(n))
				      System.out.println("IT IS A NIVEN NUMBER");
				      else
					  System.out.println("IT IS NOT A NIVEN NUMBER");
				         break;
			  
              case 8: if(Numbers.pronic(n))
				      System.out.println("IT IS PRONIC NUMBER");
				      else
					  System.out.println("IT IS NOT A PRONIC NUMBER");
				         break;
						 
			  case 9: if(Numbers.evil(n))
				      System.out.println("IT IS A EVIL NUMBER");
				      else
					  System.out.println("IT IS NOT A EVIL NUMBER");
				         break;
						 
			  case 10: if(Numbers.happy(n)==n)
				      System.out.println("IT IS A HAPPY NUMBER");
				      else
					  System.out.println("IT IS NOT A HAPPY NUMBER");
				         break;
			   
              default: System.out.println("INVALID CHOICE");
			  
		  }	         		 
			         			  
			System.out.println("DO YOU WANT TO CONTINUE ?"); 
               ch = sc.next().charAt(0);			               
		  }
		 
		 while(ch=='y' || ch=='Y');	   
   }  

}