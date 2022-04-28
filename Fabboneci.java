public class Main
{
  public static void main (String[]args)
  {
    // variable declaration
    int a = 1;
    int b = 0;
    int c = 0;
    int n= 30;

    // logic implementation
    for (int i = 0; i <= 7; i++)
      {


	c = a + b;
	if(c<=n)
	{
	System.out.println (c);
	a = b;
	b = c;
	}
      }
  }
}
