package map.Example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,Object> tm=new TreeMap<Integer,Object>();
		
		tm.put(1,25);
		tm.put(2,2.4444d);
		tm.put(3,4.44f);
		tm.put(4,"Dhanraj");
		tm.put(5,true);
		
		for(Map.Entry e: tm.entrySet())
		{
//			Integer Key=(Integer) e.getKey();
//			Object val=e.getValue();
			
			System.out.println("Key "+e.getKey()+"  Value "+e.getValue());
		}
		
	}

}
