import java.util.Scanner;
public class LargeOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num1,num2,num3;
     Scanner scan = new Scanner(System.in);
     
     num1 = scan.nextInt();
     num2 = scan.nextInt();
     num3 = scan.nextInt();
     
     if(num1 > num2 && num1 > num3)
     {
    	 System.out.println(num1+" Num1 is greater");
     }
     else
     {
    	 if(num2 > num3)
    	 {
    		 System.out.println(num2+" Num2 is greater");
    	 }
    	 else
    	 {
    		 System.out.println(num3+" Num3 is greater");
    	 }
     }
	}

}
