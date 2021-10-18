package Array_Examples;
import java.util.Scanner;
public class mat 
{
	public static void main(String[] args) 
	{
		int matrix [][] = new int[3][3];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println(" ");
		}
	}
}
