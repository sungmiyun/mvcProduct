package com.s01.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("�ӷ�");		//0
		list.add("���");		//1	
		list.add("�޵�");		//2	
		list.add("�ڵ�");		//3
		list.add("���");		//4
		
		//�ε��� Ž��
		int index1 = list.indexOf("���");
		System.out.println("ù��° ��� : " + index1);
		
		int index2 = list.lastIndexOf("���");
		System.out.println("������ ��� : " + index2);
		
		int index3 = list.indexOf("����");
		System.out.println("���� : " + index3);
		
		//����
		Collections.sort(list);
		System.out.println(list);
		System.out.println("================");
		
		//�������� ����
		Collections.reverse(list);
		System.out.println(list);
	}
}
