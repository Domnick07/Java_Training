import java.util.Scanner;
public class Quadratic_Eq 
{
   public static void main(String args[])
   {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the value for a: ");
	double a = scan.nextDouble();
	System.out.println("Enter the value for b: ");
	double b = scan.nextDouble();
	System.out.println("Enter the value for c: ");
	double c = scan.nextDouble();
	
	double d = b * b -4.0 * a *c;
	
	if(d>0.0)
	{
		double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
		double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
		
		System.out.println("The roots are " +r1+ " and " +r2);
	}
	else
	{
		if(d == 0.0)
		{
			 double r1 = -b / (2.0 * a);
			 System.out.println("The root is " +r1);
		}
		else
		{
			System.out.println("Roots are not real");
		}
	}
   } 
}
