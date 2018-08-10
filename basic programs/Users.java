import java.util.Scanner;
class Users 
{
	public static void main(String []ar)
	{   	char ch;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("enter the name");
			String name = sc.nextLine();
			char a[] = name.toCharArray();
			System.out.println("press 1 for uppercase");
			System.out.println("press 2 for lowercase");
			System.out.println("press 3 for swap");
			System.out.println("press 4 for change");
			int c = sc.nextInt();


			 switch(c)
			  {
                 case 1: System.out.println(StringCases.upper(a));
                          break;

                 case 2: System.out.println(StringCases.lower(a));
                          break;

                 case 3: System.out.println(StringCases.swap(a));
                          break;

                 case 4: System.out.println(StringCases.change(a));
                          break;

                default: System.out.println("invalid choice");

              } 
              
                  System.out.println("DO YOU WANT TO CONTINUE ?");
                        ch = sc.next().charAt(0);
		  }

		  while(ch=='y'||ch=='Y');
	}
}