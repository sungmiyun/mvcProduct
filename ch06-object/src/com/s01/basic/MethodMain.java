package com.s01.basic;
public class MethodMain {
	//��� �޼���
	//��ȯ�ϴ� ���� �ִ� ���
	public int add(int a, int b) {
		return a + b;
	}
	
	//��ȯ�ϴ� ���� ���� ���
	public void print(String str) {
		System.out.println(str);
		//�Ϲ������� ��ȯ�� ���� ���� ����
		//return ����
		return;
	}
	
	public static void main(String[] args) {
		//��ü ���� �� ����
		MethodMain m = new MethodMain();
		
		int result = m.add(5, 8);
		System.out.println("result = " + result);
		
		m.print("�ܿ�");
	}
}




