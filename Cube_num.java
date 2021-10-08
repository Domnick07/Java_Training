import java.util.Scanner;
public class Cube_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,i;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(i=1;i<=n;i++)
        {
          System.out.println("\nThe cube of "+i+ " is "+i*i*i);	
        }
	}

}
