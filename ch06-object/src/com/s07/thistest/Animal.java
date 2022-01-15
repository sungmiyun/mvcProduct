package com.s07.thistest;

public class Animal {
	/*
	 * [�ǽ�]
	 * ������� : �̸�(name), ����(age), ���࿩��(fly)
	 * 		   ���������ڴ� private
	 * ��� �޼��� : public setName/getName
	 * 					 setAge/getAge
	 * 					 setFly/isFly
	 */			
	
	private String name;
	private int age;
	private boolean fly;
	
	//���ڰ� ���� ������
	public Animal() {}
	
	//���ڰ� �ִ� ������
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
