package com.s01.basic;
public class Student04 {
	//�������(�Ӽ�)
	String name;
	int korean;
	int english;
	int math;
	
	//����޼���(����)
	//�������ϱ�
	public int makeSum() {
		return korean + english + math;
	}
	//��ձ��ϱ�
	public int makeAverage() {
		return makeSum() / 3;
	}
	
	public static void main(String[] args) {
		//��ü ���� �� ����
		Student04 s = new Student04();
		s.name = "ȫ�浿";
		s.korean = 98;
		s.english = 97;
		s.math = 96;
		
		//��ü�� ��� ������ �� ���
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.korean);
		System.out.println("���� : " + s.english);
		System.out.println("���� : " + s.math);
		
		//��ü�� ��� �޼����� ����� ���
		System.out.println("���� : " + s.makeSum());
		System.out.println("��� : " + s.makeAverage());
		
	}
}




