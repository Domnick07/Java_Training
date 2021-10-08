import java.util.Scanner;
public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int months;
     
     Scanner scan = new Scanner(System.in);
     months = scan.nextInt();
     
     if(months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 ||months == 12)
     {
    	 System.out.println("31 Days");
     }
     else
     {
    	 if(months == 4 || months == 6 || months == 9 || months == 11)
    	 {
    		 System.out.println("30 Days"); 
    	 }
    	 else
    	 {
    		 System.out.println("28 or 29 Days");
    	 }
     }
    	 
    	 
	}

}
