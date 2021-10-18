import java.util.Scanner;
public class Cal_Diff_sq 
{
  static int calculateDifference()
  {
	int n,i,sum=0,sum_sq=0,sq_sum=0,sqr;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	n = scan.nextInt();
	
	for(i=1;i<=n;i++)
	{
		sum_sq+=i*i;
	}
	
	for(i=1;i<=n;i++)
	{
		sq_sum+=i;
	}
	sqr = (sq_sum)*(sq_sum);
	sum = sum_sq - sqr;
	System.out.println("Sum of squares : "+sum_sq);
	System.out.println("Squares of sum : "+sqr);
	System.out.println("The difference of Square of sum and Sum of square is : "+sum);
    return sum;
  }
  public static void main(String args[])
  {
	  calculateDifference();  
  }
}
