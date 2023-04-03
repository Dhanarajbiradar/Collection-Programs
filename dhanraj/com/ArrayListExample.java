package dhanraj.com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add("1");
		al.add(4.44);
		al.add(true);
		al.add(9);
		al.add(4.46f);
		al.add('A');
		System.out.println(al);
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
	}

}
