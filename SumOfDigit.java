import java.util.Scanner;
public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem=0,rev=0,sum=0,sumOfDig=0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while(n>0)
		{
			rem = n%10;
			sum = (sum*10)+rem;
			sumOfDig+=rem;
			n=n/10;			
		}
		System.out.println("The Sum of digit in the number is:  "+sumOfDig);
		
	}

}
