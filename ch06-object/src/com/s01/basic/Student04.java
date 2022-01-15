package com.s01.basic;
public class Student04 {
	//멤버변수(속성)
	String name;
	int korean;
	int english;
	int math;
	
	//멤버메서드(동작)
	//총점구하기
	public int makeSum() {
		return korean + english + math;
	}
	//평균구하기
	public int makeAverage() {
		return makeSum() / 3;
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student04 s = new Student04();
		s.name = "홍길동";
		s.korean = 98;
		s.english = 97;
		s.math = 96;
		
		//객체의 멤버 변수의 값 출력
		System.out.println("이름 : " + s.name);
		System.out.println("국어 : " + s.korean);
		System.out.println("영어 : " + s.english);
		System.out.println("수학 : " + s.math);
		
		//객체의 멤버 메서드의 결곽값 출력
		System.out.println("총점 : " + s.makeSum());
		System.out.println("평균 : " + s.makeAverage());
		
	}
}




