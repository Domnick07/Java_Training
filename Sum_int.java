package Inhertance_Example;
import java.util.*;
public class Sum_int 
{
	public static void main(String args[])
	{
		String s;
		int sum=0,x=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		s=scan.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens())
		{
			String val = st.nextToken();
			x = Integer.parseInt(val);
			sum = sum+x;
		}
		System.out.println(sum);
	}	
}
