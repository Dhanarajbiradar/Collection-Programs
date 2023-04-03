package dhanraj.com;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		
		Vector v=new Vector();
		v.add("Dhanraj");
//		v.addAll(v);
		v.add('A');
		v.add(10);
		v.add(22.3);
		 
		System.out.println(v);
		
		Iterator itr=v.iterator();
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
	}

}
