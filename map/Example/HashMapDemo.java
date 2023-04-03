package map.Example;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
    HashMap<Student1,Student> hs=new HashMap<Student1,Student>(); //pass two objects
		Student s=new Student("Dhanraj");
		Student s1=new Student("Biradar");
		Student1 s2=new Student1(1);
		Student1 s3=new Student1(2);
		hs.put(s2,s);
		hs.put(s3,s1);
	
		for(Map.Entry e: hs.entrySet())
		{
			Student1 Key=(Student1) e.getKey();
			Student val=(Student) e.getValue();
			System.out.println("Key "+Key.getId()+"  Value "+val.getName());
		}
		
	}

}
