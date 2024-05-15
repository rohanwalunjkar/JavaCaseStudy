package com.rohan;

import java.time.LocalDateTime;

public class Grocery {

	private String name;
	private int pricePerUnit;
	private int quantityInStock;
	private LocalDateTime l1;
	
	
	public Grocery(String name, int pricePerUnit, int quantityInStock, LocalDateTime l1) {
		super();
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantityInStock = quantityInStock;
		this.l1 = l1;
	}
	
	
	
	@Override
	public String toString() {
		return "Grocery [name=" + name + ", pricePerUnit=" + pricePerUnit + ", quantityInStock=" + quantityInStock
				+ "]";
	}



	public void updateItem(int m)
	{
		this.quantityInStock=m;
	}
	
	public boolean emptyStock()
	{
		return this.quantityInStock==0;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public LocalDateTime getL1() {
		return l1;
	}
	public void setL1(LocalDateTime l1) {
		this.l1 = l1;
	}
	
	
	
}
