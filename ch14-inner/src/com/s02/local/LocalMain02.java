package com.s02.local;

public class LocalMain02 {
	public void innerTest() {
		int a = 100; //��������
	
		//���� ���� Ŭ����
		class Inner{
			public void getData() {
				/*
				 * JDK8.0���ʹ� ����Ŭ������ ���Ե� �޼����� ���������� 
				 * ���� Ŭ�������� ȣ���ϸ� �ڵ����� ����� ��ȯ
				 */
				//a = 200; => ����� ��ȯ�Ǿ� ���� ������ �� ����
				System.out.println("a : " + a);
			}
		}
		Inner i = new Inner();
		i.getData();	
	}
	
	public static void main(String[] args) {
		LocalMain02 m = new LocalMain02();
		m.innerTest();
		
	}
}
