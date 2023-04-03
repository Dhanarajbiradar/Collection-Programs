package dhanraj.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet<>();
		
		hs.add("1");
		hs.add(4.44);
		hs.add(true);
		hs.add(9);
		hs.add(4.46f);
		hs.add('A');
		hs.add('A');
		
		System.out.println(hs);
		
		Iterator itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}



	}

}
