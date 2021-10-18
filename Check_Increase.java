import java.util.Scanner;
public class Check_Increase 
{
	static boolean checkNumber()
	{
		boolean check=false;	
		int n;
		int rev=0,rem_10=0,rem_100,div;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=scan.nextInt();
		
		  while(n > 0)
		  {
		   rem_10 = n %10;
		   rem_100 = n % 100;
		   div = rem_100 / 10;	
		   n=n/10;
		   if(rem_10 > div)
		   {
		  	  check = true;
		  	  continue;
		   }
		   else
		   {
			 check = false;
			 break;
		   }
	      }
		System.out.println(check);
		return check;
	}
	
	public static void main(String args[])
	{
		checkNumber();
	}
}