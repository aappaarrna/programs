import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

      System.out.println ("enter first value");
    int a = sc.nextInt ();

      System.out.println ("enter Second  value");
    int b = sc.nextInt ();

      System.out.println ("enter third value");
    int c = sc.nextInt ();


    // logic implements
    if (a > b && a > c)
      {
	System.out.println (a + " is largest");
	if (b > c)
	  System.out.println (b + " is second largest");
	else
	  System.out.println (c + " is second largest");
      }
       if(b>a && b>c)
       {
            System.out.println(b+" is  largest");
            
                if(a>c)
                 System.out.println(a+" is second largest");
                 else
                  System.out.println(c+" is second largest");
            
       }
       if( c>a && c>b)
       {
        System.out.println(c+" is  largest");
        if(a>b)
         System.out.println(a+" is second largest");
         else 
         System.out.println(b+" is second largest");
       }


  }
}