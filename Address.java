import java.util.Scanner;
public class Address 
{
	String street;
	String city;
	String state;
	int pincode;
	
	House house = new House();
	
	public void Ad()
	{
		Scanner scan = new Scanner(System.in);
		
		house.Input_HD();
		System.out.println("Enter the Street name : ");
		street = scan.next();
		
		System.out.println("Enter the city name : ");
		city = scan.next();
		
		System.out.println("Enter the State name : ");
		state = scan.next();
		
		System.out.println("Enter the Pin code : ");
		pincode = scan.nextInt();
		
	}
	
	public void showAD()
	{
		house.show_HS();
		System.out.println("Street Name : \t" +street);
		System.out.println("City Name : \t" +city);
		System.out.println("State Name : \t" +state);
		System.out.println("Pincode : \t" +pincode);
	}
}
