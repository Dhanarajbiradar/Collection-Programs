package dhanraj.com;

public class ObjectArray {
	
	private int Id;
	private String name,City;
	
	public ObjectArray() {
		super();
	}
	public ObjectArray(int id, String name, String city) {
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
	

}
