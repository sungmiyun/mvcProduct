package com.s01.member;

class Outer{
	//��� ����
	int x = 100;
	//��� ����Ŭ����
	class Inner{
		int y = 200;
	}
}



public class MemberMain {
	public static void main(String[] args) {
		Outer ot = new Outer();
		System.out.println(ot.x);
		
		//��� ���� Ŭ���� ��ü ����
		Outer.Inner oi = ot.new Inner();
		System.out.println(oi.y);
		
		System.out.println(ot);
		System.out.println(oi);
	}
}
