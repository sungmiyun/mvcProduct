package com.s01.stringex;

public class StringMain02 {

	public static void main(String[] args) {
		
		String s1 = "kwon Sun ae";
					//012345678910 , ���ڿ� ���� = 11
		
		int index = s1.indexOf('n');
		System.out.println("�� ó�� ���� n�� ��ġ : " + index);
		
		index = s1.indexOf("Sun");
		System.out.println("���ڿ� Sun�� ��ġ : " + index);

		index = s1.lastIndexOf('n');
		System.out.println("������ ���� n�� ��ġ : " + index);
		
		char c = s1.charAt(7); //���� ����
		System.out.println("������ ���� : " + c);
		
		index = s1.indexOf('S');
		//index 5���� ������ index���� ���ڿ� ����
		String str = s1.substring(index);
		System.out.println("�빮�� S���� ������ �߶󳻱� : " + str);
		
		//���� index���� �� index ������ ���ڿ� ����
		str = s1.substring(index, index + 3); // 5, 8
		System.out.println("�빮�� S�κ��� 3�ڱ��� �߶󳻱� : " + str);
		
		int length = s1.length();
		System.out.println("s1�� ���� : " + length);
		
		String[] array = s1.split(" ");
		for(int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] : " + array[i]);
		}
		
		
		
	}

}
