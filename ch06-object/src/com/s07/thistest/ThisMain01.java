package com.s07.thistest;

public class ThisMain01 {
	//this�� ��ü ���ο��� ��ü�� ��Ī�� �� ����� �� �ְ� ������ �������� ������ ��.
	//��ü�� ������(�ʵ�, �޼���)�� ȣ���� �� ���
	public ThisMain01() {
		//this�� ��ü ���ο� ��ü ����
		System.out.println("��ü ���� : " + this);
		
	}
	public static void main(String[] args) {
		ThisMain01 tm = new ThisMain01();
		System.out.println("��ü ���� �� : " + tm);

	}

}

