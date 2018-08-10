import java.util.Scanner;
class Numbers
{
   public static int armstrong(int n)
   {  int d ,sum=0;
      while(n!=0)
	  {
		d=n%10;
        sum = sum + (d*d*d);
        n = n/10;  		
	  }  return(sum);
	   
   }
   
   
   
   public static boolean palindrome(int n)
   {  int d ,rev=0,a;
        a=n;
      while(a!=0)
	  {
		d=a%10;
        rev = rev*10 + d;
        a = a/10;  		
	  }  
	   if (rev==n)
	   {
		   return(true);
	   }
	       return(false);
   }
   
   
   
   
   public static int perfect(int n)
   {  int i ,sum=0;
  	  for(i=n-1;i>=1;i--)
      {
		if(n%i==0)
		{
		 sum = sum + i;	
		}			
	  }  return(sum);
	   
   }
   
   
   
  
   public static boolean prime(int i)
   {  
  	  for(int j=2;i<=i/2;i++)
      {
		if(i%j==0)
	    return(false);
	  }	
	    return(true); 
   } 
   
   
    
   public static int perfect_prime(int n)
   {  int i ,sum=0;
  	  for(i=n-1;i>=1;i--)
      {
		if(n%i==0)
		{ 
	      if(prime(i))
		  {			  
		    sum = sum + i;
		  }
		}			
	  }  return(sum);
	   
   }
   
   
   
   
   public static int special(int n)
   {  int f=1 ,sum=0 ,d;
       while(n!=0)
	  {
		d=n%10;		
  	    for(int i=1;i<=d;i++)
         {
		   f=f*i;
		 }
	    sum = sum + f;	
		n=n/10;  			
	  }return(sum);  
   }
   
   
   public static int neon(int n)
   {  int a ,d ,sum=0;
       a=n*n;
      while(a!=0)
	  {
		d=a%10;
        sum = sum + d;
        a=a/10;		  
	  } 
	 return(sum); 
	
   }
   
   
   public static boolean niven(int n)
   {  int d ,sum=0;
      while(n!=0)
	  {
		d=n%10;
        sum = sum + d;
        n=n/10;		  
	  } 
	 if(n%sum==0)
	   {
		return(true); 
	   }		 
	    return(false);
   }
   
   
   
   public static boolean pronic(int n)
   {
	   for(int i=0;i<=n/2;i++)
	   {
		   if(i*(i+1)==n)
		   return(true);
	   }    
		  return(false);  
   }
   
   
   
   public static boolean evil(int n)
   {  int bin ,sum=0;
      while(n!=0)
	  {
		bin=n%2;
        sum = sum + bin;
        n=n/2;		  
	  } 
	  if(sum%2==0)
	   {
		   return(true);
	   }   return(false);
   }
   
   
   
   
   public static int happy(int n)
   {  int d ,sum=0;
      while(n!=0)
	  {
		d=n%10;
        sum = sum + (d*d);
        n=n/10;		  
	  } 
	  return(sum);		 
   }
   
   
   
   
   
}
