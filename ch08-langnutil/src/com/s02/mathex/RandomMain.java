package com.s02.mathex;

import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		String[] gift = {"����Ʈ��", "TV", "�����", "��" };
						//  0		1		2	  3	
		
		//0.0 ~ 1.0 �̸��� ���� �߻�
		double ran = Math.random();
		System.out.println("�߻��� ���� : " + ran);
		
		int index = (int)(ran * 4); // 0 ~ 3
		System.out.println("�߻��� ���� : " + index);
		System.out.println("������ ���� : " + gift[index]);
		
		System.out.println("=============================");
		
		String[] luck = {"�ζǴ�÷", "��ſ� ����", "���� ����", "�ǰ���~~"};
						// 	0		1			2			3
		Random r1 = new Random();
		
		//0���� ���ڷ� ���޵� ���� �������� ������ ������ �߻�
		index = r1.nextInt(4);	//0 ~ 3
		System.out.println("�߻��� ���� : " + index);
		System.out.println("������ � : " + luck[index]);
		
	
	}
}
