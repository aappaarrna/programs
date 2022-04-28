// intermediate 6th ques
//WAP to find average of numbers  using array
public class Main
{
  public static void main (String[]args)
  {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    double sum = 0;
    double avg = 0;
    for (int i = 0; i < arr.length; i++)
      {
	sum = sum + arr[i];
	avg = sum / arr.length;
      }

    System.out.println (avg);
  }


}
