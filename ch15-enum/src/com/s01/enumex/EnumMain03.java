package com.s01.enumex;

enum Item{
	ADD, DEL, SEARCH, CANCEL
}

public class EnumMain03 {
	public static void main(String[] args) {
		System.out.println(Item.ADD);
		System.out.println(Item.DEL);	
		System.out.println(Item.SEARCH);
		System.out.println(Item.CANCEL);
		System.out.println("---------------");
		
		//values()�޼���� ���� Ÿ���� ��� ���� ��ü���� �迭�� ����� ��ȯ
		for(Item n : Item.values()){
						//���ڿ� ���          ������
			System.out.println(n + " : " + n.ordinal());
		}
		
		
	}
}
