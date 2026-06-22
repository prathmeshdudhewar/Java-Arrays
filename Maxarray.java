import java.util.*;
public class Maxarray
{
  public static void main(String x[])
  {
  
      Scanner xyz= new Scanner(System.in);
	  int a[]=new int[5];
	  System.out.println("Enter value in arraay");
	  for(int i=0; i<a.length; i++)
	  {
	     a[i]=xyz.nextInt();
	  }
	  int max=a[0];
	  for(int i=1; i<a.length; i++)
	  {
	     if(a[i]>max)
		 {
		   max=a[i];
		  }
		 
	   }
	   
	   System.out.println("max value is "+max);
   }
   
}