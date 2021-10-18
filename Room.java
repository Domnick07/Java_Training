import java.util.Scanner;
public class Room 
{
 int room_no;
// String type;
 String color;
  
 public void Input_RD()
 {
   Scanner scan = new Scanner(System.in);	 
   System.out.println("Enter the Room number");
   room_no = scan.nextInt();
   
   System.out.println("Enter the Room color");
   color = scan.next();  
 }
 
 public void show_RS()
 {
	 System.out.println("Room number : \t" +room_no);
	 System.out.println("Room color : \t" +color); 
 }
}
