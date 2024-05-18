package com.pet;

public class Order {
	
	private int orderId;
	private int petId;
	private int quantity;
	private Status s1;
	
	public Order(int orderId, int petId, int quantity, Status s1) {
		super();
		this.orderId = orderId;
		this.petId = petId;
		this.quantity = quantity;
		this.s1 = s1;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getS1() {
		return s1;
	}

	public void setS1(Status s1) {
		this.s1 = s1;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", s1=" + s1 + "]";
	}
	
	
	
	
}
