package com.s06.statictest;

class StaticMethod{
	//�ν��Ͻ� �޼���
	public void print(String str) {
		System.out.println(str);
	}
	//static �޼���
	public static String getString() {
		return "�ܿ�";
	}
	
}

public class StaticMain03 {
	public static void main(String[] args) {
		//ȣ���ϸ� �޸𸮿� ��������� ��ȯ ���� ����� �� ����
		System.out.println(StaticMethod.getString());
		
		//�ν��Ͻ� �޼���� ��ü ���� �� ȣ���ؾ� ��
		//print("����");
		StaticMethod sm = new StaticMethod();
		sm.print("��");
		
		
		
	}
}
