package com.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Employee implements Serializable{
	
	int empno;
	String ename;
	int salary;
	public Employee(int empno, String ename, int salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	public String toString()
	{
		return empno+" "+ename+" "+salary; 
	}
}

public class EmployeeProject {

	public static void main(String[] args) throws Exception  {

		int choice =-1;
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		File f=new File("EmployeeDeta.txt");
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		ListIterator li=null;
		if(f.isFile())
		{
			ois=new ObjectInputStream(new FileInputStream(f));
//			al=(ArrayList<Employee>) ois.readObject()
			al=(ArrayList<Employee>) ois.readObject();
			ois.close();
		}
		
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("0.Exit");
			System.out.println("Enter your choice: ");
			choice=s.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("Enter how many employee you want:");
				int n=s.nextInt();
				for(int i=0;i<n;i++)
				{
				System.out.println("Enter Employee No:");
				int empno=s.nextInt();
				
				System.out.println("Enter Employee Name:");
				String ename=s1.nextLine();
				
				System.out.println("Enter Employee Salary");
				int salary=s.nextInt();
				
				al.add(new Employee(empno,ename,salary));
				}
				oos=new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(al);
				oos.close();
				break;
				
			case 2:
				System.out.println("---------------------------------");
				li=al.listIterator();
				while(li.hasNext())
					System.out.println(li.next());
				System.out.println("---------------------------------");
				break;
			}
			
		}while(choice!=0);
	}

}
