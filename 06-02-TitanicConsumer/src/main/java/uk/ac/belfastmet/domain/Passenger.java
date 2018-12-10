package uk.ac.belfastmet.domain;


public class Passenger {

	
	private Integer passengerId;
	private String survived;
	private String pclass;
	private String name;
	private String sex;
	private Integer age;
	
	

	public Passenger() {
		super();
	}
	
	
	

	public Passenger(String survived, String pclass, String name, String sex, Integer age) {
		super();
		this.survived = survived;
		this.pclass = pclass;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}




	public Integer getPassengerid() {
		return passengerId;
	}

	public void setPassengerid(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public String getSurvived() {
		return survived;
	}

	public void setSurvived(String survived) {
		this.survived = survived;
	}

	public String getPclass() {
		return pclass;
	}

	public void setPclass(String pclass) {
		this.pclass = pclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
