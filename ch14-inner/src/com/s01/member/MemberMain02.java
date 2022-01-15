package com.s01.member;

class Outer2{
	//멤버 변수
	private int x = 100;
	
	//멤버 내부 클래스
	class Inner2{
		private int y = 200;
		
		//멤버 메서드
		public void make() {
			//Outer2의 x를 멤버로 인식하기 때문에 호출이 가능
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}

public class MemberMain02 {
	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		//멤버 내부클래스 객체 생성
		Outer2.Inner2 oi = ot.new Inner2();
		oi.make();
	}
}
