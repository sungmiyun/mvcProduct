package com.s01.basic;
public class MethodMain {
	//멤버 메서드
	//반환하는 값이 있는 경우
	public int add(int a, int b) {
		return a + b;
	}
	
	//반환하는 값이 없는 경우
	public void print(String str) {
		System.out.println(str);
		//일반적으로 반환할 값이 없는 경우는
		//return 생략
		return;
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain m = new MethodMain();
		
		int result = m.add(5, 8);
		System.out.println("result = " + result);
		
		m.print("겨울");
	}
}




