package com.s07.thistest;

public class Animal {
	/*
	 * [실습]
	 * 멤버변수 : 이름(name), 나이(age), 비행여부(fly)
	 * 		   접금지정자는 private
	 * 멤버 메서드 : public setName/getName
	 * 					 setAge/getAge
	 * 					 setFly/isFly
	 */			
	
	private String name;
	private int age;
	private boolean fly;
	
	//인자가 없는 생성자
	public Animal() {}
	
	//인자가 있는 생성자
	public Animal(String name, int age, boolean fly) {
		this.name = name;
		this.age = age;
		this.fly = fly;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	public boolean isFly() {
		return fly;
	}
}
