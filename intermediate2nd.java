// intermediate 3rd program
//WAP to reverse a number using while loop

import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
      int r=0;
     Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
      int a=sc.nextInt();
      
      while(a>0)
      {
       int d=a%10;
        r=r*10+d;
        a=a/10;

      }
      System.out.println(r);
    
  }
}
    
    
    
    
    
    
    
    
    
    
    