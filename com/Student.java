package dhanraj.com;

public class Student implements Comparable{
	
	private static final Student Object = null;
	private int Id;
	private String name,City;
	
	public Student() {
		super();
	}
	public Student(int id, String name, String city) {
		super();
		Id = id;
		this.name = name;
		City = city;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public int compareTo(Object o) {
		
		Student s=(Student) o;
		
		if(this.Id>s.Id)
		{
			return 1;
		}
		else if(this.Id<s.Id)
		{
			return -1;
			
		}
		else
		{
			return 0;
		}
	}
	
	

}
