package com.s01.enumex;

enum Item2{
	ADD(5), DEL(11), SEARCH(2), CANCEL(22);
	
	//���� ������ ��� ������ �����ϱ� ���� ����
	private final int var;
	
	
	//������
	Item2(int v) {
		var = v;
	}
	
	public int getVar() {
		return var;
	}
}


public class EnumMain04 {
	public static void main(String[] args) {
		System.out.println(Item2.ADD);			//ADD
		System.out.println(Item2.ADD.getVar());	//5
		System.out.println("-------------------");
		
		for(Item2 n : Item2.values()) {
			System.out.println(n + " : " + n.getVar());
		}	
	}
}
