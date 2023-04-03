package dhanraj.com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedObjmain {

	public static void main(String[] args) {
    LinkedList<ObjectArray>  al=new LinkedList<ObjectArray> ();
		
		ObjectArray ob1=new ObjectArray(1,"Dhanraj","Latur");
		ObjectArray ob2=new ObjectArray(2,"Vinay","Ausa");
		ObjectArray ob3=new ObjectArray(3,"Shubham","Pune");
		
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		System.out.println(al);
		
		Iterator it= al.iterator();
		while(it.hasNext()) {
			
			ObjectArray st=(ObjectArray) it.next();
			System.out.println("  Id= "+st.getId()+"  Name: "+st.getName()+"  City: "+st.getCity());
			
		}

	}

}
