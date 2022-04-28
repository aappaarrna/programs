//intermediate 7
// WAP to find sum of array;
package twentytwo;
import java.util.Scanner;


public class damini
{
	
	 public static void main(String[] args) 
	{
		 int sum=0;
		 Scanner sc=new Scanner(System.in);
	     int arr[]=new int[10];
	     System.out.println("enter n:");
	     int n=sc.nextInt();
	     System.out.println("enter elements:");
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    
	    }
	    System.out.println("array:");
	    for(int i=0;i<n;i++)
	    {
	   sum= sum+arr[i];
	    
	    }
	       System.out.println(sum);
	}
}
