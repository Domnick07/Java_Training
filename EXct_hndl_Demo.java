package Exception_examples;
import java.util.Scanner;
public class EXct_hndl_Demo {

	public static void main(String[] args) throws IncorrectName 
	{
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		if(name.length()<6)
		{
			throw new IncorrectName("Cannot be less than 6 characters");
		}

	}

}
