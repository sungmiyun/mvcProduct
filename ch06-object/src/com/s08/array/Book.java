package com.s08.array;

public class Book {
	
	private String category;
	private String name;
	private int price;
	private double discount;

	//인자가 없는 생성자
	public Book() {}
	
	//인자가 있는 생성자
	public Book(String category, String name, int price, double discount) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	
}
