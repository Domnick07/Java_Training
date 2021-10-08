import java.util.Scanner;
public class Sum_Avg 
{
  public static void main(String args[])
  {
	  int n,i,m;
	  int sum=0,avg=0;
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Enter the number");
	  n = scan.nextInt();
	  System.out.println("\n Enter " +n+ " numbers");
	  for(i=0;i<n;i++)
	  {
		  m = scan.nextInt();
		  sum += m;
	  }
	  avg = sum /n;
	  System.out.println("The Sum is : "+sum);
	  System.out.println("\nThe Average is : "+avg);  
  }
  }