package com.s03.queue;

import java.util.LinkedList;

public class QueueMain {
	public static void main(String[] args) {
		//ť(queue) : ���Լ��� FIFO(First-In First-Out) �ڷ� ����
		String[] array = {"����", "�λ�", "�뱸", "����", "��õ"};
		
		LinkedList<String> list = new LinkedList<String>();
		
		for(int i = 0; i < array.length; i++) {
			list.offer(array[i]); //��ü ����
		}
		
		//LinkedList�� ����� ����� ���
		System.out.println(list);
		
		//ť�� ����� ù��° ��Ҹ� �˻�
		while(list.peek() != null) {
			//ť�� ����� ù��° ��Ҹ� ��ȯ�ϰ� ����
			System.out.print(list.poll() + "\t");
		}
		System.out.println();//�ٹٲ�
		System.out.println(list);
		
		
	}
}
