package com.s01.basic;
public class Student {
	
	//변수
	String name;
	int age;
	
	public static void main(String[] args) {
		//객체 선언
		Student student;
		//객체 생성
		student = new Student();
		
		//객체의 멤버변수에 데이터 할당
		student.name = "홍길동";
		student.age = 20;
		
		//객체의 멤버변수에 저장된 데이터를 출력
		System.out.println(student.name);
		System.out.println(student.age);
		
	}
}




