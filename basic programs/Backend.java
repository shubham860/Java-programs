import java.util.Scanner;
class Backend
{


	public static char[] remove(char a[])
	{    int count=0;
	  for(int i=0;i<a.length;i++)
	  {
	  	if((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z'))
          {
             count++;
          }
	  }
	    int j=0;
	  char b[] = new char[count];
	  for(int i=0;i<a.length;i++)
	  {
        if((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z'))
          {
             b[j]=a[i];
               j++;
          }
	  } return(b);
	}



   

   public static void frequency(char a[])
   {      int count=0,j=0;
           for(char i='a';i<='z';i++)
           {
              for(j=0;j<a.length;j++)
              {
              	if(a[j]==i)
              	{
              		count++;
              		break;
              	}
              }
               if(count!=0)
                {
                  System.out.println(i+"comes"+count+"times");
                }
           }
    	}
   }



   public static boolean palindrome(char a[])
   {   
   	char b[] = new char[a.length];
   	for(int i=a.length-1,j=0; i>=0; i--,j++)
   	 {
       b[j] = a[i];
   	 }

   	  if(b[j]==a[i])
   	  {
   	 	return(true);
   	  }
   	   return(false);
   } 

}