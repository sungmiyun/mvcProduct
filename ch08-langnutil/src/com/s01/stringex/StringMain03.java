package com.s01.stringex;

public class StringMain03 {

	public static void main(String[] args) {
		String s1 = " aBa ";
		String s2 = "abc";
		int a = 100;
		String msg = null;
		
		//�ҹ��� -> �빮��
		msg = s1.toUpperCase();
		System.out.println("msg : " + msg);
		
		//�빮�� -> �ҹ���
		msg = s1.toLowerCase();
		System.out.println("msg : " + msg);
		
		//old���� -> new���ڷ� ��ü
		msg = s1.replace("aB", "b");
		System.out.println("msg : " + msg);
		
		//�� �� ���� ����
		msg = s1.trim();
		System.out.println("msg : " + msg);
		
		//���ڷ� ���޵Ǵ� ���ڿ��� ���ԵǾ� �ִ��� ����
		boolean f = s1.contains("aB");
		System.out.println("f : " + f);
		
		//���ڷ� ���޵Ǵ� ���ڿ��� ���۵Ǵ��� ����
		f = s2.startsWith("ab");
		System.out.println("f : " + f);
		
		//���ڷ� ���޵Ǵ� ���ڿ��� �������� ����
		f = s2.endsWith("bc");
		System.out.println("f : " + f);
		
		//int -> String
		msg = String.valueOf(a); // 100 -> "100"
		msg = a + ""; // 100 -> "100"
		
		
		
		
	}

}
