package com.s01.basic;
public class Student02 {
	//멤버 변수
	String name;
	int age;
	String hobby;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student02 s = new Student02();
		
		//객체가 생성될 때 멤버변수에 기본적으로 초기화한 값 출력
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.hobby);
		
		System.out.println("---------------");
		
		//객체의 멤버변수에 값을 할당
		s.name = "홍길동";
		s.age = 30;
		s.hobby = "축구";
		
		//객체의 멤버변수에 할당한 값 출력
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.hobby);
		
		System.out.println("---------------");
		
		//객체 선언 및 생성
		Student02 s2 = new Student02();
		s2.name = "박문수";
		s2.age = 40;
		s2.hobby = "육상";
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.hobby);
	}
}


