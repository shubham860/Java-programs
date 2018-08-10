import java.util.Scanner;
class StringCases
{

   public static char[] upper(char ch[])
	 {
       for(int i=0;i<ch.length;i++)
         {
          	if(ch[i]>='a' && ch[i]<='z')
        	 {
       		  int b = (int)ch[i];
       		   b = b-32;
       		  ch[i] = (char)b;
             }
         }return(ch);
	 }


   public static char[] lower(char ch[])
	{
       for(int i=0;i<ch.length;i++)
         {
          	if(ch[i]>='A' && ch[i]<='Z')
        	 {
       		  int b = (int)ch[i];
       		   b = b+32;
       		  ch[i] = (char)b;
             }
         }return(ch);
	 }


   public static char[] swap(char ch[])
   {
       for(int i=0;i<ch.length;i++)
         {
          	if(ch[i]>='a' && ch[i]<='z')
        	 {
       		  int b = (int)ch[i];
       		   b = b-32;
       		  ch[i] = (char)b;
             }

           else

           	if(ch[i]>='A' && ch[i]<='Z')
        	 {
       		  int b = (int)ch[i];
       		   b = b+32;
       		  ch[i] = (char)b;
              }
          } return(ch);
	 }


   public static char[] change(char ch[])
   {
   	  	if(ch[0]>='a'&&ch[0]<='z')
   	  	{
   	  		int b = (int)ch[0];
   	  		  b = b-32;
   	  		 ch[0] = (char)b ;
   	  	}

   	  	for(int i=0;i<ch.length;i++)
   	  	 {
   	  	 	if((ch[i]==' ')&&(ch[i+1]>='a' && ch[i+1]<='z'))
   	  	 	{
   	  	 		int b = (int)ch[i+1];
   	  	 		    b = b-32;
   	  	 		 ch[i+1] = (char)b;
   	  	 	}
   	  	 }	
   	  return(ch);
   }
 

     
}