package main;

public class User {
	private String name;
	private int age;
	private String address;
	private int ident; //to function as a uniqueID, they are sequentially assigned and do not repeat. thinking to proof this when I do the sql ver
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIdent() {
		return ident;
	}
	public void setIdent(int ident) {
		this.ident = ident;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	
		

}
