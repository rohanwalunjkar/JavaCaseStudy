package com.pet;

public class Pet {

	
	private int petId;
	private String name;
	private Category cat;
	private double unitPrice;
	private int stocks;
	
	
	public Pet(int petId, String name, Category cat, double unitPrice, int stocks) {
		super();
		this.petId = petId;
		this.name = name;
		this.cat = cat;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}


	public int getPetId() {
		return petId;
	}


	public void setPetId(int petId) {
		this.petId = petId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category getCat() {
		return cat;
	}


	public void setCat(Category cat) {
		this.cat = cat;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getStocks() {
		return stocks;
	}


	public void setStocks(int stocks) {
		this.stocks = stocks;
	}


	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", cat=" + cat + ", unitPrice=" + unitPrice + ", stocks="
				+ stocks + "]";
	}
	
	
	
	
}
