package com.s01.list;

import java.util.ArrayList;

public class ArrayListMain04 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("����");
		al.add("�λ�");
		al.add("����");
		al.add("�뱸");
		al.add("��õ");
		
		//�ݺ����� �̿��� ����� ���
		for(int i = 0; i < al.size(); i++) {
			System.out.println(i + " : " + al.get(i));
		}
		
		System.out.println("=======================");
		
		//����� ����
		//al.remove(2);	//�ε��� 2 ����
		al.remove("�λ�"); //��� ���� 
		for(int i = 0; i < al.size(); i++) {
			System.out.println(i + " : " + al.get(i));
		}
	}
}
