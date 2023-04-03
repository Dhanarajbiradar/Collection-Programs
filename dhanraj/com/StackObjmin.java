package dhanraj.com;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackObjmin {

	public static void main(String[] args) {
      Stack <ObjectArray> al=new Stack<ObjectArray>();
		
		ObjectArray ob1=new ObjectArray(1,"Dhanraj","Latur");
		ObjectArray ob2=new ObjectArray(2,"Vinay","Ausa");
		ObjectArray ob3=new ObjectArray(3,"Shubham","Pune");
		
		al.push(ob1);
		al.push(ob2);
		al.push(ob3);
		al.pop();
	   //set 
//		System.out.println(al);
		
		Iterator it= al.iterator();
		while(it.hasNext()) {
			
			ObjectArray st=(ObjectArray) it.next();
			System.out.println("  Id= "+st.getId()+"  Name: "+st.getName()+"  City: "+st.getCity());
			
		}
		

	}

}
