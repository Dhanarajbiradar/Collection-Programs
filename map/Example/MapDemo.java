package map.Example;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,Object> hs=new HashMap<Integer,Object>();
		
		hs.put(1,234);
		hs.put(2,4.44);
		hs.put(3,'D');
		hs.put(4, "Dhanraj");
		hs.put(1,4);
		hs.put(2,4.554);
		hs.put(3,'A');
		hs.put(4, "Biradar");
		
		for(Map.Entry e: hs.entrySet())
		{
			Integer Key=(Integer) e.getKey();
			Object val=e.getValue();
			
			System.out.println("Key "+Key+"  Value "+val);
		}
		
	}
}
