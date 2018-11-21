
public class Toy {
	
	
	private String toyName;
	private String firstName;
	private String lastName;
	
	
	public Toy(String toyName, String firstName, String lastName) {
		this.toyName = toyName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Toy() {
		super();
	}
	

	public String gettoyName() {
		return toyName;
	}

	public void settoyName(String toyName) {
		this.toyName = toyName;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

}
