import java.util.Scanner;
class EvenOddArray
{
  public static void main(String []ar)
  {  
    Scanner sc = new Scanner(System.in);
	System.out.println("enter the elements in array");
	int a[] = new int[5];
	int b[] = new int[a.length];
	int c[] = new int[a.length];
	for(int i=0;i<a.length;i++)
	{
	 a[i] = sc.nextInt();
	}
	   int j=0,k=0;
	for(int i=0;i<a.length;i++)
    {   if(a[i]%2==0)
	    {
	      b[j] = a[i];
		  j++;
	    }
	   else
	   {
	      c[k] = a[i];
		  k++;
	   }  
	}
	System.out.println("even and odd array are:");
	   for(int d:b)
	    {
		System.out.print(d+"\t");
		}
	 for(int e:c)
	    {
		System.out.println(c+"\t");
		}
  }
}