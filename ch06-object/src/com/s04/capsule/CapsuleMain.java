package com.s04.capsule;

class Capsule{
	//����ȭ
	//private : ���� Ŭ���������� ȣ�� ����
	private int a;
	
	//ĸ��ȭ
	public void setA(int n) {
		if(n>=0) {
			a = n;
		} else { //����
			System.out.println("������ ������ �ʽ��ϴ�.");
		}
		
	}
	public int getA() {
		return a;
	}
	
}

public class CapsuleMain {

	public static void main(String[] args) {
		Capsule cap = new Capsule();
		//a������ private���� �����Ǿ� �ٸ� Ŭ�������� ȣ�� �Ұ��� 
		//cap.a = 100;
		
		//������ ����
		cap.setA(100);
		//������ ȣ��
		System.out.println(cap.getA());
		
		//���� ����
		cap.setA(-100);
		//������ ȣ��
		System.out.println(cap.getA());
		
		
	}

}
