import java.util.Scanner;
public class Table 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Table of 13 \t 49 \t 75\n");
		while(number <=10)
		{
			System.out.println(" 13 * " +number+" = " +number*13+"\t\t  49* " +number+" = " +number*49+"\t\t 75 * " +number+" = " +number*75);
			
			number++;
		}


	}

}
