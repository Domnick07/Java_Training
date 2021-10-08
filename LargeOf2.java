import java.util.Scanner;
public class LargeOf2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int num1,num2;
        Scanner scan = new Scanner(System.in);
        
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        if(num1 > num2)
        {
        	System.out.println("Num1 is greater " +num1);
        }
        System.out.println("Num2 is greater " +num2);
	}

}
