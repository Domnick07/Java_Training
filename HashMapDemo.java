package Array_Examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
      HashMap<Integer,String> map = new HashMap<Integer,String>();		
      map.put(1, "John");
      map.put(1, "Peter");
      map.put(2, "John");
      map.put(3, "John");
      for(Map.Entry m: map.entrySet())
      {
    	System.out.println(m.getKey()+ " "+m.getValue()); 
      }
	}

}
