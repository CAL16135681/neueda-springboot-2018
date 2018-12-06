package uk.ac.belfastmet.cereal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity


public class Cereal {
	
	@Id
	@GeneratedValue
	private Integer cerealid;
	private String manufacturer;
	private String cereal;
	private Integer energy;
	private Integer calories;
	private Integer protein;
	private Integer carbohydrate;
	private Integer sugars;
	private Integer fat;
	private Integer saturates;
	private Integer fibre;
	private Integer sodium;
	private Integer salt;
	private Integer iron;
	
	public Cereal() {
		super();
	}

	public Cereal(Integer cerealid, String manufacturer, String cereal, Integer energy, Integer calories,
			Integer protein, Integer carbohydrate, Integer sugars, Integer fat, Integer saturates, Integer fibre,
			Integer sodium, Integer salt, Integer iron) {
		super();
		this.cerealid = cerealid;
		this.manufacturer = manufacturer;
		this.cereal = cereal;
		this.energy = energy;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.sugars = sugars;
		this.fat = fat;
		this.saturates = saturates;
		this.fibre = fibre;
		this.sodium = sodium;
		this.salt = salt;
		this.iron = iron;
	}

	public Integer getCerealid() {
		return cerealid;
	}

	public void setCerealid(Integer cerealid) {
		this.cerealid = cerealid;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCereal() {
		return cereal;
	}

	public void setCereal(String cereal) {
		this.cereal = cereal;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getProtein() {
		return protein;
	}

	public void setProtein(Integer protein) {
		this.protein = protein;
	}

	public Integer getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Integer carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Integer getSugars() {
		return sugars;
	}

	public void setSugars(Integer sugars) {
		this.sugars = sugars;
	}

	public Integer getFat() {
		return fat;
	}

	public void setFat(Integer fat) {
		this.fat = fat;
	}

	public Integer getSaturates() {
		return saturates;
	}

	public void setSaturates(Integer saturates) {
		this.saturates = saturates;
	}

	public Integer getFibre() {
		return fibre;
	}

	public void setFibre(Integer fibre) {
		this.fibre = fibre;
	}

	public Integer getSodium() {
		return sodium;
	}

	public void setSodium(Integer sodium) {
		this.sodium = sodium;
	}

	public Integer getSalt() {
		return salt;
	}

	public void setSalt(Integer salt) {
		this.salt = salt;
	}

	public Integer getIron() {
		return iron;
	}

	public void setIron(Integer iron) {
		this.iron = iron;
	}

	
	
	
	

}
