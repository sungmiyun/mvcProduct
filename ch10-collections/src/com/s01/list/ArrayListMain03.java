package com.s01.list;

import java.util.ArrayList;


public class ArrayListMain03 {
	public static void main(String[] args) {
		/*
		 * ���׸� ǥ�� : ��ü�� ������ �� ��ü�� ������ �� �ִ� ����� Ÿ���� ����
		 */
		//String���� �����ؼ� ����Ǵ� ��ü�� �ڷ����� String�� ����,
		//�ٸ� Ÿ���� ��ü�� �����ϸ� ���� �߻�
		ArrayList<String> al = new ArrayList<String>();
		al.add("��ȣ��");		//String -> Object
		al.add("�豸��");		//String -> Object
		//al.add(1000);		//Inter -> Object
		al.add("�ڸ��");		//String -> Object
		
		//�ݺ����� �̿��ؼ� ����� ��� ���
		for(int i = 0; i < al.size(); i++) {
			String name = al.get(i);
			System.out.println(name);
		}
		System.out.println("==============");
		//Ȯ�� for���� �̿��� ����� ���
	}
}