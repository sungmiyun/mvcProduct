package com.s08.array;

public class Car {
	/*
	 * [실습]
	 * 멤버 변수 : 이름(name), 색깔(color), 가격(price)
	 *         : 접근 지정자 -> private
	 * 생성자 : 인자가 없는 생성자, 인자가 있는 생성자
	 * 멤버 메서드 : set/get 
	 */
	
	private String name;
	private String color;
	private int price;
	
	public Car() {}
	
	public Car(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;	
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
