import java.util.Scanner;
class Fibonacci
{  
        public static void series(int n)
	      {  int a=0 , b=1 , i=3, c=1;
		   System.out.println(a);
		   System.out.println(b);
			  for(i=3;i<=n;i++)
		        {
			       c = a+b;
				   
				   System.out.println(c); 
				   a = b;
				   b = c;
		        } 
		    } 
        
        public static int nth(int n)
         {  int a=0 , b=1 , i=3, c=1;
		  System.out.println(a);
		  System.out.println(b);		  
           	 for(i=3;i<=n;i++)
			 
		        {
			       c = a+b;
				   a = b;
				   b = c;
                }
				 return(c);
		   }
        public static boolean check(int n)
		 { int a=0, b=1, i=3, c=1;
		      for(i=3;c<=n;i++)
		        {   c=a+b;
			         a=b;
					 b=c;
				   if(c==n)
				   {
					 return(true);     
                   }
		        } return(false);
		 }		
		
		
	
       public static void main(String []ar)
        {  
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the number");
           int n= sc.nextInt();
           System.out.println("press 1 for find the series");
	       System.out.println("press 2 for find nth term of series");
	       System.out.println("press 3 for check the term in series");
	       System.out.println("enter your choice ?");
            int ch= sc.nextInt();
	  
	      switch(ch)
	     {  
	        case 1:  series(n);
		            break;
				
            case 2: System.out.println(nth(n));
            	    break;
				
		    case 3:System.out.println(check(n));
		            break;
				 
			default: System.out.println("invalid");	
		 }	
		   		   
        } 

  
} 