package uk.ac.belfastmet.titanic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Titanic {
	
	@Id
	@GeneratedValue
	private Integer passengerid;
	private String survived;
	private String pclass;
	private String name;
	private String sex;
	private Integer age;
	
	
	public Titanic() {
		super();
	}

	public Titanic(Integer passengerid, String survived, String pclass, String name, String sex, Integer age) {
		super();
		this.passengerid = passengerid;
		this.survived = survived;
		this.pclass = pclass;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Integer getPassengerid() {
		return passengerid;
	}

	public void setPassengerid(Integer passengerid) {
		this.passengerid = passengerid;
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
