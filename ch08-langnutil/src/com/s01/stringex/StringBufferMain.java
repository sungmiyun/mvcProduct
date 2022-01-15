package com.s01.stringex;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("���� ����!");
		System.out.println("1 : " + sb);
		
		//������ �ε����� ���� ����
		sb.insert(2 , '��');
		System.out.println("2 : " + sb);	
		
		//���� ���ڿ� �ڿ� ������ ����
		sb.append("������ " );
		System.out.println("3 : " + sb);
		
		sb.append("�ÿ��ϴ�");
		System.out.println("4 : " + sb);
		
		//���� index���� �� index������ ������ ���ڿ��� ��ü
		sb.replace(0, 3, "���డ��!!"	);
		System.out.println("5 : " + sb);
		
		//������ index�� ���� ����
		sb.deleteCharAt(0);
		System.out.println("6 : " + sb);
		
		//���� index���� ��index ������ ����
		sb.delete(0, 3);
		System.out.println("7 : " + sb);
		
		//StringBuffer -> String
		String str = sb.toString();
		System.out.println("str = " + str);
		
		
	}

}
