package com.s07.thistest;

public class AnimalMain {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���ڰ� ���� �����ڸ� �̿��ؼ� Animal ��ü ����
		 * set�޼��带 �̿��ؼ� �̸�, ����, ���࿩�� ����
		 * �̸�, ����, ���࿩�θ� ���
		 * 
		 * [��¿���]
		 * �̸� : �⸰
		 * ���� : 12��
		 * ���࿩�� : �Ұ���
		 */
		
		Animal a = new Animal();
		a.setName("�⸰");
		a.setAge(12);
		a.setFly(false);
		
		System.out.println("�̸� : " + a.getName());
		System.out.println("���� : " + a.getAge() + "��");
		System.out.println("���࿩�� : " + printFly(a.isFly()));
		
		System.out.println("============");
		
		//���ڰ� �ִ� �����ڷ� ��ü ����
		//�̸�, ����, ���࿩�� ���
		Animal a1 = new Animal("��ѱ�", 5, true);
		System.out.println("�̸� : " + a1.getName());
		System.out.println("���� : " + a1.getAge() + "��");
		System.out.println("���࿩�� : " + printFly(a1.isFly()));
		
		
	} //end of main
	
	private static String printFly(boolean fly) {
		return fly ? "����" : "�Ұ���";
	}
	
}
