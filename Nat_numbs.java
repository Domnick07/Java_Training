import java.util.Scanner;
public class Nat_numbs {
	public static void main(String args[])
	{
		int n,i,sum=0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(i=0;i<=n;i++)
		{
		   System.out.println("\n"+i);
		   sum+=i;
		}
		System.out.println("\nSum is : "+sum);
	}

}
