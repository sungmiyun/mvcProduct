package com.s01.basic;
public class Student03 {
	
	//�������
	String name;
	int korean;
	int english;
	int math;
	int sum;
	double average;
	
	public static void main(String[] args) {
		//��ü ���� �� ����
		Student03 s = new Student03();
		s.name = "ȫ�浿";
		s.korean = 98;
		s.english = 97;
		s.math = 95;
		s.sum = s.korean + s.english + s.math;
		s.average = s.sum/3.0;
		
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.korean);
		System.out.println("���� : " + s.english);
		System.out.println("���� : " + s.math);
		System.out.println("���� : " + s.sum);
		System.out.printf("��� : %.2f",s.average);
	}
}




