import java.util.Scanner;
class Table
{
  public static void main(String []ar)
  {  
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number and of its table and no off product");
      int a= sc.nextInt();
	  int n= sc.nextInt();
     for(int i=1;i<=n;i++)
	 {
		System.out.println(a+"*"+i+"="+(a*i)); 	 
	 }
  }
}
