package com.s01.basic;

public class MethodMain03 {

	//���� ���� ��� : ���� ȣ��
	//�޼��� ȣ��� �����Ϸ��� ���ڸ� ����(��ü)�ڷ����� ����� ��츦 �ǹ�
	//�ּ�(reference)�� �����Ͽ� ����
	
	public void increase(int[] n) {
		for(int i = 0 ; i < n.length; i++) {
			n[i]++;
		}
	}
	
	public static void main(String[] args) {
		//�迭 ����
		int[] ref1 = {100,200,300};
		System.out.println("=====������ ������=====");
		for(int i = 0; i<ref1.length; i++) {
			System.out.println("ref1[" + i +"] : " + ref1[i]);
		}
		System.out.println("====������ ���� ��====");
		
		//��ü ���� �� ����
		MethodMain03 m = new MethodMain03();
		m.increase(ref1);
		
		
		
		
	}

}
