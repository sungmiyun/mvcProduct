package com.s01.list;

import java.util.ArrayList;


public class ArrayListMain05 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(16);
		
		System.out.println(al);
		System.out.println("============");
		
		//¦������
		//�ε��� 0���� ������ �ε������� �ݺ��ϸ鼭 ���ǿ� ���� ������ ��� �ε��� ������
		//�Ͼ�� ������ üũ���� ���ϰ� ����ġ�� �����Ͱ� �߻��� �� ����
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i) % 2 == 0) {
				al.remove(i);
			}
		}
		System.out.println(al);
		System.out.println("=============");
		
		//������ �ε������� �ε��� 0���� �ݺ����� �����ϸ鼭 Ư�� ������ �� �����͸� ����
		for(int i = al.size() - 1; i >= 0 ; i--) {
			if(al.get(i) % 2 == 0) {
				al.remove(i);
			}
		}
		System.out.println(al);
		
		
	}
}
