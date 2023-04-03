package dhanraj.com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet<>();
		t.add(23);
		t.add(2);
		t.add(13);
		t.add(22);
		t.add(23);
		t.add(25);
		t.add(45);
		t.add(7);
		t.add(3);
		System.out.println(t);
		
		Iterator itr=t.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
