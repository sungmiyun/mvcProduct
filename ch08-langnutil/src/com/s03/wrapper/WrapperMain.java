package com.s03.wrapper;

public class WrapperMain {
	public static void main(String[] args) {
		char c = 'A';
		//��ü ����
		//�⺻ �ڷ��� ������ -> ���� �ڷ��� ������
		Character wrap_c = new Character(c);
		//���� �ڷ��� ������ -> �⺻ �ڷ��� ������ 
		System.out.println(wrap_c.charValue());
		
		int d = 12;
		//��ü ����
		//�⺻ �ڷ��� ������ -> ���� �ڷ��� ������
		Integer wrap_d = new Integer(d);
		//���� �ڷ��� ������ -> �⺻ �ڷ��� ������
		System.out.println(wrap_d.intValue());
		
		
		
		
		
	}

}
