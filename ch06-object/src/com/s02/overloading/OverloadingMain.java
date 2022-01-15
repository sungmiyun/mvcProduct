package com.s02.overloading;

public class OverloadingMain {
	/*
	 * Method Overloading(중복 정의)이라는 것은 하나의 클래스 내에서 
	 * 같은 이름을 가지는 메서드가 여러개 정의되는 것을 말한다.
	 * 인자의 타입 또는 갯수, 배치된 순서가 다를 경우 다른 메서드로 인식함.
	 */
	public void print(int n) {
		System.out.println("정수 n = " + n);
	}
	
	public void print(double n) {
		System.out.println("실수 n = " + n);
	}
	
	public void print(double n, long a) {
		System.out.println("실수 n = " + n + ",정수 a = " + a);
	}
	
	public void print(long a, double n) {
		System.out.println("정수 a = " + a + ",실수 n = " + n);
	}
	
	public static void main(String[] args) {
		OverloadingMain om = new OverloadingMain();
		om.print(20);
		om.print(5.6);	
		om.print(3.7, 1234L);
		om.print(1234L, 3.7);
		
	}
}
