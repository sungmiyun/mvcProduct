package com.s01.stringex;

public class StringMain01 {

	public static void main(String[] args) {
		//�Ͻ������� ��ü ����
		//�Ͻ������� String ��ü�� �����ϸ� ���� ���ڿ��϶� ���� ��ü�� ����.
		String str1 = "abc";
		String str2 = "abc";
		
		//��ü ��
		if(str1 == str2) {
			System.out.println("str1�� str2�� ���� ��ü");
		}else {
			System.out.println("str1�� str2�� �ٸ� ��ü");
		}
		
		//���ڿ� ��
		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ����(���ڿ�)�� ����.");
		} else {
			System.out.println("str1�� str2�� ����(���ڿ�)�� �ٸ���.");
		}
		
		System.out.println("===================================");
	
		//��������� ��ü ����
		//��������� ��ü�� �����ϸ� ���ڿ��� ���Ƶ� ���� �ּҰ� �ο��ǰ� ���ε��� ��ü�� ������
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		//��ü��
		if(str3 == str4 ) {
			System.out.println("str3�� str4�� ���� ��ü");
		} else {
			System.out.println("str3�� str4�� �ٸ� ��ü");
		}
		
		//���ڿ� ��
		if(str3.equals(str4)) {
			System.out.println("str3�� str4�� ����(���ڿ�)�� ����.");
		} else {
			System.out.println("str3�� str4�� ����(���ڿ�)�� �ٸ���.");
		}
		

		System.out.println("===================================");
	
		String str5 = "bus";
		String str6 = "BUS";
		
		//��ҹ��� �������� ���ڿ� ��
		if(str5.equalsIgnoreCase(str6)) {
			System.out.println("��ҹ��� �������� str5�� str�� ������ ����.");
		} else {
			System.out.println("��ҹ��� �������� str5�� str�� ������ �ٸ���");
		}
		
	}

}
