import java.util.Scanner;
public class Div_by_3_and_5 
{
  static int calculateSum()
  {
	  int n,i,sum=0;
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the number : ");
	  n = scan.nextInt();
	  
	  for(i=1;i<=n;i++)
	  {
		  if(i%3 == 0 || i%5 == 0)
		  {
			  sum+=i;
		  }
	  }
	  System.out.println("The sum is : "+sum);
	  return sum;
  }
  public static void main(String args[])
  {
	  calculateSum();
  }
}