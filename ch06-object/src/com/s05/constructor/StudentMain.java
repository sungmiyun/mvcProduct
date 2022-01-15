package com.s05.constructor;

class Student{
	/*
	 * [�ǽ�]
	 * Student
	 * ��� ���� : ����(korean), ����(english), ����(math), ����(history), �����(num)
	 * ������ : ����, ����, ����, ������� �Է¹޴� ������,
	 * 		  ����, ����, ����, ����, ������� �Է¹޴� ������
	 * ��� �޼��� : ���� ���ϱ�(int getTotal()), 
	 *            ��� ���ϱ�(int getAverage())
	 * 
	 * StudentMain
	 * Student ��ü ���� <--- ����, ����, ����,3
	 * ������ ��� ���
	 * Student ��ü ���� <--- ����, ����, ����, ����, 4
	 * ������ ��� ���
	 */
	
	int korean, english, math, history, num;
	public Student(int k, int e, int m, int n) {
		korean = k;
		english = e;
		math = m;
		num = n;
	}
	public Student(int k, int e, int m, int h, int n) {
		korean = k;
		english = e;
		math = m;
		history = h;
		num = n;	
	}
	public int getTotal() { 
		int total;
		if(num == 3){
			total = korean+english+math;
		}else{
			total = korean+english+math+history;
		}
		return total;
	}
	public int getAverage() {
		return getTotal() / num;
	}
	
	
}

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student(58,84,97,3);
		System.out.println("���� : " + s1.getTotal());
		System.out.println("��� : " + s1.getAverage());
		
		System.out.println("===========");
		
		Student s2 = new Student(74, 87, 95, 74, 4);
		System.out.println("���� : " + s2.getTotal());
		System.out.println("��� : " + s2.getAverage());
		
		
	}
}
