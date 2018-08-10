import java.util.Scanner;
class EvenOdd
{ 
  public static void method(int lr,int ur)
  {  
	int even_sum=0,odd_sum=0;
    for(int i=lr;i<=ur;i++)
	{
		if(i%2==0)
		{
			even_sum = even_sum + i;
		}
		else 
			odd_sum = odd_sum + i ;
	}
        System.out.println("sum of even terms="+even_sum);
        System.out.println("sum of odd terms="+odd_sum);		
		
  }
      public static void main(String []ar)
        {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the range");
          int lr= sc.nextInt();//lr=lower range
          int ur= sc.nextInt();//ur=upper range
         method(lr,ur);		  
		}  	
	  	
}