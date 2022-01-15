package com.s04.wdate;

import java.util.Calendar;

public class CalendarMain {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		System.out.print("������ ");
		
		int year = today.get(Calendar.YEAR);		//�⵵	
		int month = today.get(Calendar.MONTH) + 1;	//�� 0 ~ 11
		int date = today.get(Calendar.DATE); 		//��
		
		System.out.print(year + "��"	+ month + "��" + date + "�� ");
		
		int day = today.get(Calendar.DAY_OF_WEEK);	//���� 1 ~ 7
		
		String nday = "";
		switch(day) {
		case 1 : nday = "��";	break;
		case 2 : nday = "��";	break;
		case 3 : nday = "ȭ";	break;
		case 4 : nday = "��";	break;
		case 5 : nday = "��";	break;
		case 6 : nday = "��";	break;
		case 7 : nday = "��";	break;
		}
		System.out.print(nday + "���� ");
		
		int amPm = today.get(Calendar.AM_PM); 	//���� 0. ���� 1
		String str = amPm == Calendar.AM ? "����" : "����";
		System.out.print(str + " ");
		
		int hour = today.get(Calendar.HOUR);			//�� (12��)
		int hour24 = today.get(Calendar.HOUR_OF_DAY); 	//HOUR_OF_DAY (24�� ǥ��)
		int min = today.get(Calendar.MINUTE);			//��
		int sec = today.get(Calendar.SECOND);			//��
		System.out.println(hour24 + ":" + min + ":" + sec);

		
		
	}
}
