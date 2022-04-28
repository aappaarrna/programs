import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    // variable declaration

    int sum = 0;
    



    // creating object of scanner class
    Scanner sc = new Scanner (System.in);

      System.out.println ("enter first value");
    int a = sc.nextInt ();

      System.out.println ("enter last  value");
    int b = sc.nextInt ();

    // logic implementation

    for (int i = a; i <= b; i++)
      {
   	int count = 1;

	for (int j = 1; j <= a; j++)
	  {

	    if (i % j == 0)
	      count++;
	  }
	if (count == 2)
	  {
	    System.out.println (i + "is prime number");
	    sum = sum + i;
	  }

      }
      // displaying result
    System.out.println (" sum of all prime numbers is " + sum);

  }
}
