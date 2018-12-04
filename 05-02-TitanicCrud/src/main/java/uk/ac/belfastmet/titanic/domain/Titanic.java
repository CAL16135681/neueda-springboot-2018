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
	

	public Titanic() {
		super();
	}

	

	public Titanic(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}



	public Integer getDwarfId() {
		return dwarfId;
	}



	public void setDwarfId(Integer dwarfId) {
		this.dwarfId = dwarfId;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
