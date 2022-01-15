package com.s01.basic;
public class Student03 {
	
	//멤버변수
	String name;
	int korean;
	int english;
	int math;
	int sum;
	double average;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student03 s = new Student03();
		s.name = "홍길동";
		s.korean = 98;
		s.english = 97;
		s.math = 95;
		s.sum = s.korean + s.english + s.math;
		s.average = s.sum/3.0;
		
		System.out.println("이름 : " + s.name);
		System.out.println("국어 : " + s.korean);
		System.out.println("영어 : " + s.english);
		System.out.println("수학 : " + s.math);
		System.out.println("총점 : " + s.sum);
		System.out.printf("평균 : %.2f",s.average);
	}
}




