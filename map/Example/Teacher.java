package map.Example;

public class Teacher {
	
	private int Id;
	private String name;
	
	public Teacher() {
		super();
	}
	public Teacher(int id, String name) {
		super();
		Id = id;
		this.name = name;
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
	
	

}