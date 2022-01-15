package com.s04.wdate;

import java.util.Calendar;
import java.util.Scanner;


public class CalendarMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Calendar ��ü ����
		Calendar cal = Calendar.getInstance();
		
		System.out.println("��� ������ ���� �Է��ϼ���~ (ex ���� : 2021, �� : 1)");
		System.out.print("���� : ");
		int year = sc.nextInt();
		System.out.print("�� : ");
		int month = sc.nextInt();
		
		System.out.println("    [" + year + "�� " + month + "��]");
		System.out.println("-------------------");
		System.out.println("  �� ��  ȭ ��  ��  �� ��");
		
		//����ϴ� ����, ��, �� ����
		//���� ������ 0~11�̱� ������ �Է¿� - 1,
		//���� �޷��� 1�Ϻ��� �����ϱ� ������ 1�Ϸ� ����
		//	     ��       �� 	   ��
		cal.set(year, month-1, 1);
		//1���� ������ ����(1 : �Ͽ��� ~ 7 : �����)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//���� ������ ���� ����
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		
		//������ ����� 1���� ���� ���Ͽ� ǥ�õǵ��� ó��
		for(int i = 1; i < week; i++) {
			System.out.printf("%3s", " ");
		}
		
		//1�� ~ ���� ������ ��¥���� �ݺ����� �̿��ؼ� ǥ��
		for(int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%3d", i);
			//����� ������ �ٹٲ�
			if(week % 7 == 0) {
				System.out.println(); //�ٹٲ�
			}
			week++;
			
		}
		
		
		
		sc.close();
		
	}
}
