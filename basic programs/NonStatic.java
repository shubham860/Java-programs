import java.util.Scanner;
class NonStatic
{ int num;
    public void set(int a)
   {
      num = a; 
   }
    public int square()
   {
     return(num*num); 
   }
    public static void main(String []ar)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a number");
     int a = sc.nextInt();
      NonStatic s = new NonStatic();
        s.set(a);
     System.out.println("its square is:"+s.square()); 
   }
}