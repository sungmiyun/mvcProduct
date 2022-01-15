package com.s04.anonymous;

//�θ�Ŭ����
class Inner6{
	public void disp() {
		System.out.println("disp �޼���");
	}
}

public class AnonymousMain {
	
	public void make() {
		//�͸� ����Ŭ����
		Inner6 i = new Inner6() {
			@Override
			public void disp() {
				System.out.println("�͸� ����Ŭ������ disp");
			}
		};
		i.disp();
	}
	
	public static void main(String[] args) {
		AnonymousMain am = new AnonymousMain();
		am.make();
		
	}

}
