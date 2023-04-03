package dhanraj.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SirializationDeseriazation {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Dhanraj");
		al.add("Viany");
		al.add("Shubham");
		
		try {
			FileOutputStream fos=new FileOutputStream("File");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			
			FileInputStream fis=new FileInputStream("File");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList list=(ArrayList) ois.readObject();
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
//		
		
		
	}

}
