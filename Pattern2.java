import java.util.Scanner;
public class Pattern2
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int rows=5;
  System.out.println("");
  int count=rows;
  for (int i=0; i<=rows; i++)
  {
  for (int j=1; j<=i*2; j++)
  {
    System.out.print(" ");
  }
  for(int j=1; j<=count; j++) 
  {
    System.out.print(j+" ");
  }
  for(int j=count-1; j>=1; j--) 
  {
   System.out.print(j+" ");
  }
   System.out.println();
   count--;
  }
 }
}
