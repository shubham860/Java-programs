import java.util.Scanner;
class Reverse
{
  public static int reverse(int n)
  {
    int d,rev=0;
	  while(n!=0)
	  {
	    d = n%10;
		rev = rev*10 + d;
        n = n/10;		
	  }
	     return(rev);
  }
   
   public static void main(String []ar)
   {
    Scanner sc = new Scanner(System.in);
	System.out.println("enter the elements in arrray");
	int a[] = new int[5];
    int b[] = new int[a.length]; 
    
    for(int i=0;i<a.length;i++)
     {
	   a[i] = sc.nextInt();
	 }
    System.out.println("reverse of each digit");
    for(int i=0;i<a.length;i++)
     {
	  b[i] = reverse(a[i]);
	 }
     
    for(int c:b)
    {
     System.out.println(c+"\t");
	}	
   }
   
}
