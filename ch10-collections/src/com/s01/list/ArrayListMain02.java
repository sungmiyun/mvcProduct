package com.s01.list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("��ȣ��");		//String -> Object
		al.add("�ڸ��");		//String -> Object
		al.add("���缮");		//String -> Object
		al.add("�豸��");		//String -> Object
		
		//�ݺ����� �̿��ؼ� ����� ��� ���
		for(int i = 0; i < al.size(); i++) {
			String name = (String)al.get(i);
			System.out.println(name);
		}
		
	}
}
