// intermediate 1st program
//WAP to calculate power of a number using for loop

import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    //int b=0;

    // logic implementation

    Scanner sc = new Scanner (System.in);
      System.out.println (" enter number");
    int a = sc.nextInt ();
    for (int i = 1; i <= a; i++)
      {
	if (i == a)
	  {
	    int b = 0;
	      b = a * i;

	      System.out.println (b);
	  }
      }
  }
}
