public class Main
{
	public static void main(String[] args) {
	     // variable declaration
	      int n=20;
	      int sum=0;
	      
	      
	      // logic implementation
	      for(int i=1;i<=n;i++)
	      {
	          if( i%2!=0)
	          System.out.println(i);
	          sum =sum+i;
	          
	      }
	      
	      // result display
	      System.out.println(" sum of all odd numbers is"+sum);
	}
}