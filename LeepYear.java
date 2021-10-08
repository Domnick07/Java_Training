import java.util.Scanner;
public class LeepYear 
{

	public static void main(String[] args) 
	{
      int year;
      Scanner scan = new Scanner(System.in);
      
      year = scan.nextInt();
      
      if(year % 4==0)
      {
    	System.out.println("The year " +year+ " is a leep year");  
      }
      else
       System.out.println("The year " +year+ " is not a leep year");
	}

}
