import java.util.Scanner;
public class Pos_Neg 
{
   public static void main(String args[])
   {
	    int number;
	    Scanner scan = new Scanner(System.in);
	    
	    number = scan.nextInt();
	    
	    if(number >0)
	    {
	    	System.out.println("The number " +number+ " is positive");
	    }
	    else
	    	System.out.println("The number " +number+ " is negetive");
   }

}
