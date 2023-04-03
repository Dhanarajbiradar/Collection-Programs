
package map.Example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Student,Teacher> lm=new LinkedHashMap<Student,Teacher>();
		int count=0;
		lm.put(new Student("Dhanraj"), new Teacher(1,"Amol K"));
		lm.put(new Student("Tukaram"), new Teacher(2,"Kishor J"));
		lm.put(new Student("Akash  "), new Teacher(1,"Amol K"));
		lm.put(new Student("Rahul  "), new Teacher(2,"Kishor J"));
		lm.put(new Student("Piush  "), new Teacher(2,"Amol K"));
		
		System.out.println(" Students        Id        Teachers");
		for(Entry<Student, Teacher> e:lm.entrySet())
		{
			Student s=(Student) e.getKey();
			Teacher t=(Teacher) e.getValue();
			count++;
			System.out.println(count+")"+s.getName()+"         "+t.getId()+"         "+t.getName());
		}

	}


}
