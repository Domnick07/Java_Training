import java.util.Scanner;
public class House 
{
  int H_no;
  String H_name;
  Room room = new Room();
 
  public void Input_HD()
  {
	  Scanner scan = new Scanner(System.in);
	  room.Input_RD();
	  System.out.println("Enter House Number : ");
	  H_no = scan.nextInt();
	  
	  System.out.println("Enter House name :");
	  H_name = scan.next();
  }
  public void show_HS()
  {
	  room.show_RS();
	  System.out.println("House Number : \t#" +H_no);
	  System.out.println("House Name : \t" +H_name);
  }
}
