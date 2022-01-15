package com.s07.thistest;

public class LocalVariable {
	//멤버변수 : 클래스 블럭 내에서 정의된 변수
	int b = 200;
	
	public void make() {
		/*
		 * 지역변수 : 메서드, 생성자, 제어문 블럭 내에서 생성된 변수, 해당 블럭이 종료되면 변수는 소멸됨
		 */
		int a = 100;
		System.out.println("a : " + a); //지역변수
		System.out.println("b : " + b); //멤버변수
	}
	
	public void fun() {
		//fun 메서드 안에 a변수가 정의되지 않아서 호출 불가
		//System.out.println("a = " + a);
		System.out.println("b : " + b); //멤버변수
	}
	
	
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) { //제어문 블럭 안의 지역변수
			System.out.print(i + "\t");
		}
		System.out.println("\n---------------");
		//제어문 블럭을 빠져나와서 i가 소멸되었고 main 메서드에 i가 정의되지 않아서 호출 불가
		//System.out.println(i);
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
		}
		
	}
}
