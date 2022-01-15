package com.s01.basic;

class Account{
	/*
	 * [�ǽ�]
	 * Account
	 * 1)������� : ���¹�ȣ(account_num),������(name),
	 *            �ܰ�(balance)
	 * 2)����޼��� : �����ϱ�(deposite),����ϱ�(withdraw)
	 *   ������ ���� ���ڷ� ���޵Ǿ� balance�� ������
	 *   ����� ���� ���ڷ� ���޵Ǿ� balance���� ������
	 *   
	 *   ��������ǥ���ϱ�(printAccount)
	 *   ���¹�ȣ : 100-1234-678
	 *   ������ : ȫ�浿
	 *   �ܰ� : 20,000��
	 * 
	 * BankMain
	 * Account ��ü ����
	 * ������ �⺻ ���� �Է�(���¹�ȣ,������,�ܰ�) 
	 * 
	 * �������� ���
	 * �Ա��ϱ� ����
	 * �������� ���
	 * ����ϱ� ����
	 * �������� ���
	 */
	
	//�������
	String account_num; //���¹�ȣ
	String name;//������
	int balance;//�ܰ�
	
	//����޼���
	//�����ϱ�
	public void deposite(int money) {
		balance += money; //����
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
	}
	//����ϱ�
	public void withdraw(int money) {
		balance -= money; //����
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
	//�������� ����
	public void printAccount() {
		System.out.println("���¹�ȣ : " + account_num);
		System.out.println("������ : " + name);
		System.out.printf("�ܰ� : %,d��%n", balance);
		System.out.println("---------------");
	}
	
}

public class BankMain {
	public static void main(String[] args) {
		//���� ����
		Account account = new Account();
		//���� �⺻ ���� �Է�
		account.account_num = "101-1234";
		account.name = "ȫ�浿";
		account.balance = 10000;
		
		//���� ���� ���
		account.printAccount();
		
		//�Ա�
		account.deposite(20000);
		//���� ���� ���
		account.printAccount();
		
		//���
		account.withdraw(15000);
		//���� ���� ���
		account.printAccount();
		
	}
}


