package com.s01.basic;
public class Student {
	
	//����
	String name;
	int age;
	
	public static void main(String[] args) {
		//��ü ����
		Student student;
		//��ü ����
		student = new Student();
		
		//��ü�� ��������� ������ �Ҵ�
		student.name = "ȫ�浿";
		student.age = 20;
		
		//��ü�� ��������� ����� �����͸� ���
		System.out.println(student.name);
		System.out.println(student.age);
		
	}
}




