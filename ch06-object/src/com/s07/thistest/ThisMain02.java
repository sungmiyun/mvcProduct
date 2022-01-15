package com.s07.thistest;

class ThisTest{
	//은닉화
	private int a;

	//캡슐화
	//지역변수명과 멤버변수명이 동일하면 지역변수명이 명시된 메서드에서 지역변수가 우선적으로 호출됨
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
}

public class ThisMain02 {

	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(10);
		System.out.println(tt.getA());
		
		
	}

}
