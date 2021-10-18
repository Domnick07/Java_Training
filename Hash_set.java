package Array_Examples;
import java.util.HashSet;
public class Hash_set 
{
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Domnick");
		hs.add("A");
		
		System.out.println("Before adding duplicate values: "+hs);
		
		hs.add("Domnick");
		hs.add("Dom");
		
		System.out.println("After adding duplicate values :"+hs);
		
		hs.add(null);
		hs.add(null);
		System.out.println("After adding null values :"+hs);	
	}

}
