package com.s01.basic;
public class InstanceMain2 {
	//멤버 변수
	int var1;
	String str;
	
	//멤버 메서드
	public int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		InstanceMain2 im = new InstanceMain2();
		//객체의 멤버 메서드 호출
		int result = im.sum(10, 20);
		System.out.println("result = " + result);
	}
}








