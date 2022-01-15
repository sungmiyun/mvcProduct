package com.s05.constructor;

class Car2{
	String color;
	String gearType;
	int door;
	
	//인자가 없는 생성자
	public Car2() {}
	
	
	//인자가 있는 생성자
	public Car2(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarMain02 {

	public static void main(String[] args) {
		Car2 c1 = new Car2("Blue", "auto", 2);

		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		System.out.println("-------------");
		
		Car2 c2 = new Car2();
		c2.color = "Black";
		c2.gearType = "manual";
		c2.door = 4;

		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		
	}

}
