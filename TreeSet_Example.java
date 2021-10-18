package Array_Examples;
import java.util.*;
public class TreeSet_Example 
{
	public static void main(String[] args) 
	{
	  TreeSet<String> set = new TreeSet<String>();
	  
	  set.add("A");
	  set.add("B");
	  set.add("C");
	  set.add("D");
	  set.add("E");
	  
	  System.out.println("Initial Set :"+set);
	  System.out.println("Head set :"+set.headSet("C"));
	  System.out.println("Sub set :"+set.subSet("A","E"));
	  System.out.println("Tail set :"+set.tailSet("B"));

	}

}
