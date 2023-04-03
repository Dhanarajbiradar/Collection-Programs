package dhanraj.com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
  LinkedList al=new LinkedList();
		
		al.add("1");
		al.add(4.44);
		al.add(true);
		al.add(9);
		al.add(4.46f);
		al.add('A');
		al.addFirst("Dhanraj");
		al.addLast("Biradar");
		
		System.out.println(al);
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
