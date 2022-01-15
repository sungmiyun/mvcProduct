package com.s05.constructor;

class Student{
	/*
	 * [실습]
	 * Student
	 * 멤버 변수 : 국어(korean), 영어(english), 수학(math), 역사(history), 과목수(num)
	 * 생성자 : 국어, 영어, 수학, 과목수를 입력받는 생성자,
	 * 		  국어, 영어, 수학, 역사, 과목수를 입력받는 생성자
	 * 멤버 메서드 : 총점 구하기(int getTotal()), 
	 *            평균 구하기(int getAverage())
	 * 
	 * StudentMain
	 * Student 객체 생성 <--- 국어, 영어, 수학,3
	 * 총점과 평균 출력
	 * Student 객체 생성 <--- 국어, 영어, 수학, 역사, 4
	 * 총점과 평균 출력
	 */
	
	int korean, english, math, history, num;
	public Student(int k, int e, int m, int n) {
		korean = k;
		english = e;
		math = m;
		num = n;
	}
	public Student(int k, int e, int m, int h, int n) {
		korean = k;
		english = e;
		math = m;
		history = h;
		num = n;	
	}
	public int getTotal() { 
		int total;
		if(num == 3){
			total = korean+english+math;
		}else{
			total = korean+english+math+history;
		}
		return total;
	}
	public int getAverage() {
		return getTotal() / num;
	}
	
	
}

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student(58,84,97,3);
		System.out.println("총점 : " + s1.getTotal());
		System.out.println("평균 : " + s1.getAverage());
		
		System.out.println("===========");
		
		Student s2 = new Student(74, 87, 95, 74, 4);
		System.out.println("총점 : " + s2.getTotal());
		System.out.println("평균 : " + s2.getAverage());
		
		
	}
}
