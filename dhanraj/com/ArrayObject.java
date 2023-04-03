package dhanraj.com;

import java.util.Iterator;
import java.util.Vector;

public class ArrayObject {

	public static void main(String[] args) {
		
//		ArrayList<ObjectArray> al=new ArrayList<ObjectArray>();
		Vector <ObjectArray> al=new Vector<ObjectArray>();
		
		ObjectArray ob1=new ObjectArray(1,"Dhanraj","Latur");
		ObjectArray ob2=new ObjectArray(2,"Vinay","Ausa");
		ObjectArray ob3=new ObjectArray(3,"Shubham","Pune");
		
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		al.remove(0);
//		System.out.println(al);
		
		Iterator it= al.iterator();
		while(it.hasNext()) {
			
			ObjectArray st=(ObjectArray) it.next();
			System.out.println("  Id= "+st.getId()+"  Name: "+st.getName()+"  City: "+st.getCity());
			
		}
		
		
	}

}
