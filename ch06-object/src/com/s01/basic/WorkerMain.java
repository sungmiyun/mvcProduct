package com.s01.basic;
class Worker{
	/*
	 * [�ǽ�]
	 * �̸�(name),��(money),����(balance) ���� ����
	 * work �޼���� �� �� �����ϸ� money�� 1000�� ����
	 * 
	 * deposite �޼���� money�� ���� balance�� ������Ű
	 * money�� 0���� ó��
	 * ------------------
	 * ��ü�� �����ؼ�
	 * ���� �̸� ����
	 * 10�� ���ϴµ� �� ���� 3000���� ������ ����
	 * ���� �̸�, money, balance �� ���
	 */
	//��� ����
	String name;
	int money;
	int balance;
	//��� �޼���
	//���ϴ� �޼���
	public void work() {
		money += 1000;
	}
	//�����ϴ� �޼���
	public void deposite() {
		balance += money;
		money = 0;
	}
}

public class WorkerMain {
	public static void main(String[] args) {
		//��ü ���� �� ����
		Worker worker = new Worker();
		//���� �̸� ����
		worker.name = "ȫ�浿";
		
		//10�� ���ϴµ� �� ���� 3000���� ������ ����
		for(int i=1;i<=10;i++) {
			//���ϱ�
			worker.work();
			if(worker.money>=3000) {//worker.money%3000==0
				//�����ϱ�
				worker.deposite();
			}
		}
		
		System.out.println("���� �̸� : " + worker.name);
		System.out.printf(
			 "���� �Աݵ��� ���� �޿� : %,d��%n" , worker.money);
		System.out.printf(
				"������ �ܰ� : %,d��", worker.balance);
	}
}




