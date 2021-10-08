import java.util.Scanner;
public class Factorial_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact =1;
		int i =1;
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		while(i <=num)
		{
			fact = fact*i;
			i++;
		}
		System.out.println("Factorial of " +num+ " is : " +fact);

	}

}
