package Inhertance_Example;
import java.util.Scanner;
import java.lang.*;
public class Mirror_Str 
{
   public static void main(String args[])
   {
	   Scanner scan = new Scanner(System.in);
	   StringBuffer str = new StringBuffer(); 
	   StringBuffer rev = new StringBuffer();
	   str.append(scan.nextLine());
	   System.out.print(str);
	   rev=str.reverse();
	   System.out.print(" | " +rev);
   }
}
