package com.s02.local;

public class LocalMain {
	public void innerTest() {
		//���� ���� Ŭ����
		class Inner{
			public void getData() {
				System.out.println("Local ���� Ŭ����");
			}
		}
		//���� ���� Ŭ���� ��ü ����
		Inner i = new Inner();
		i.getData();
	}	
	public static void main(String[] args) {
		LocalMain m = new LocalMain();
		m.innerTest();
		
		
		
		
	}

}
