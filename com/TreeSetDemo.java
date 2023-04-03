package dhanraj.com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Student>t=new TreeSet<Student>();

		Student ob3=new Student(3,"Shubham","Pune");
		Student ob1=new Student(1,"Dhanraj","Latur");
		Student ob2=new Student(2,"Vinay","Ausa");
		
		
		t.add(ob1);
		t.add(ob2);
		t.add(ob3);
		System.out.println(t);
		
		Iterator it= t.iterator();
		while(it.hasNext()) {
			
			Student st=(Student) it.next();
			System.out.println("  Id= "+st.getId()+"  Name: "+st.getName()+"  City: "+st.getCity());
			
		}
		
	}

}
