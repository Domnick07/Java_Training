import java.util.Scanner;
public class Num_Dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int n,rem=0,sum=0,rev,dig;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: \n");
		n = scan.nextInt();
		System.out.println("Enter the Digit: \n");
		dig = scan.nextInt();
		rev = n;
		while(n>0)
		{
			rem = n%10;
			sum = (sum*10)+rem;
			n=n/10;
		}
			if(rem == dig)
			{
				System.out.println("\nThe digit is in the number:");
			}
			else
				System.out.println("\nThe digit is not in the number:");
				
		}


	}

