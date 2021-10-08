import java.util.Scanner;
public class SumOfEvn_Odd 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n,rem=0,sum=0,sum_even=0,sum_odd=0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while(n>0)
		{
			rem = n%10;
			sum = (sum*10)+rem;
			n=n/10;
			if(rem % 2 ==0)
			{
		      sum_even+=rem;		
			}
			else
				sum_odd+=rem;
		}
		System.out.println("The sum of even number is : "+sum_even);
		System.out.println("The sum of odd number is : "+sum_odd);
		

	}

}
