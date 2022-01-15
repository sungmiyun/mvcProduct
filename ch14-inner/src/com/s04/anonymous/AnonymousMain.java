package com.s04.anonymous;

//부모클래스
class Inner6{
	public void disp() {
		System.out.println("disp 메서드");
	}
}

public class AnonymousMain {
	
	public void make() {
		//익명 내부클래스
		Inner6 i = new Inner6() {
			@Override
			public void disp() {
				System.out.println("익명 내부클래스의 disp");
			}
		};
		i.disp();
	}
	
	public static void main(String[] args) {
		AnonymousMain am = new AnonymousMain();
		am.make();
		
	}

}
