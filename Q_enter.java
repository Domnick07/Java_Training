import java.util.Scanner;
public class Q_enter 
{
   public static void main(String args[])
   {
	   int n,sum=0,rev=0,flag=0,avg=0,rem;
	   char ch;
	   Scanner scan = new Scanner(System.in);
	   
	   /*while(true)
	   {
		   System.out.println("Enter your choice");
		   System.out.println("1. Press Q/q to stop the execution :\n2. Press any charecter to continue..\n ");
		   
		   ch = scan.next().charAt(0);
		   if(ch == 'Q' || ch == 'q')
		   {
			   System.out.println("You have choose to quite : ");
		       System.out.println("The sum is : "+sum);
		       System.out.println("The Average is : "+avg);
		       break;
		   }
		   else
		   {
		  	  System.out.println("Enter the number: ");
			  n = scan.nextInt();
			  flag = flag+1;
			  sum = sum+n;
			  avg = sum /flag;
			  continue;
		   }
	   }*/
	   while(true)
	   {
		System.out.println("Enter the number :");
		n = scan.nextInt();
		flag = flag+1;
		sum = sum+n;
		avg = sum /flag;
		System.out.println("Enter your choice");
		System.out.println("1. Press Q/q to stop the execution :\n2. Press any charecter to continue..\n ");
		ch = scan.next().charAt(0);
		if(ch =='Q' || ch == 'q')
		{
			System.out.println("You have choose to quite : ");
		    System.out.println("The sum is : "+sum);
		    System.out.println("The Average is : "+avg);
		    break; 	
		}
		else
			continue;
	   }
   }
}