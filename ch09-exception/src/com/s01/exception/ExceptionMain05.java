package com.s01.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionMain05 {
	/*
	 * 
	 * �޼��忡 throws ����Ŭ������ ����ϸ� �޼��峻�� try ~ catch ���� ������ �� �ְ�
	 * ���ܰ� �߻��ϸ� ���ܸ� �����ϰ� �޼��带 ȣ���� ���� try ~ catch���� ������
	 * try ~ catch�� ���ܸ� �絵��
	 */
	
	public void printData() throws IOException, NumberFormatException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�� �Է� : ");
		int dan = Integer.parseInt(br.readLine());
		System.out.println(dan + "��");
		System.out.println("===================");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}

	
	public static void main(String[] args) {
		ExceptionMain05 em = new ExceptionMain05();
		try {
			em.printData();
		}catch(Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
				
	}
}
