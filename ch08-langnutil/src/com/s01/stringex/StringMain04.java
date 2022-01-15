package com.s01.stringex;

public class StringMain04 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���ڿ����� �ҹ��ڴ� �빮��, �빮�ڴ� �ҹ��ڷ� �����Ͻÿ�.
		 * �ƽ�Ű �ڵ� : 65 ~ 90 �빮��
		 * 			  97 ~ 122 �ҹ���
		 * ���ڿ��� ���� : length()
		 * ���ڿ����� ���� ���� : charAt(index)
		 * �ҹ��� -> �빮�� : toUpperCase()
		 * �빮�� -> �ҹ��� : toLowerCase()
		 * ���� -> ���ڿ� : String.valueOf(����)
		 */
		String str = "abcMDte-4W?EWzz";
		String result = "";
		
		
		//1��
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c >= 65 && c <= 90) {
				result += String.valueOf(c).toLowerCase(); 
			} else if ( c >= 97 && c <= 122) {
				result += String.valueOf(c).toUpperCase(); 
			} else {
				result += c;
			}
		}
		//����� ���
		System.out.println(result);

		System.out.println("===========================");
		
		//2��
		String result2 = "";
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); //���� ����
			if(c >= 65 && c <= 90) { //�빮�� -> �ҹ���
				result2 += (char)(c + 32);
			} else if(c >= 97 && c <= 122) { //�ҹ��� -> �빮��
				result2 += (char)(c - 32);
			} else { //�빮�ڵ� �ҹ��ڵ� �ƴ� ���
				result2 += c;
			}
		}
		System.out.println(result2);
		
		System.out.println("================================");
		
		
		//3��
		String result3 = "";
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) { //�빮��
						//  �빮�� -> �ҹ���
				result3 += Character.toLowerCase(c);
			} else if(Character.isLowerCase(c)) { //�ҹ���
						//  �ҹ��� -> �빮��
				result3 += Character.toUpperCase(c);
			} else { //�빮�ڵ� �ҹ��ڵ� �ƴ� ���
				result3 += c;
			}
			
		}
		
		System.out.println(result3);
		
	}
}
