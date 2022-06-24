package fr.dawan.javapoo.interface_.task2;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = -1288895610482051140L;
	
	private int id;
	private String  decription; 
	private double price;
	
	
	public Product() {
		super();
	}

	public Product(int id, String decription, double price) {
		super();
		this.id = id;
		this.decription = decription;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", decription=" + decription + ", price=" + price + "]";
	}
	

}
