package com.s01.exception;

public class ExceptionMain04 {
	public static void main(String[] args) {
		//try ~ catch ~ finally
		//finally ���� ���ܰ� �߻��ϵ� �߻����� �ʵ� finally ���� �����
		//DataBase ���� �Ǵ� �Է�, file ���� �� �ڿ��� �����ؾ��� �� finally ������ ó����
		System.out.println("====���ܰ� �߻����� ���� ��====");
		try {
			System.out.println("1");
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
		System.out.println("���α׷� ����~");
		
		System.out.println("=============");
		System.out.println("====���ܰ� �߻��� ��====");
		try {
			System.out.println("1");
			System.out.println(10/0);
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
		System.out.println("���α׷� ����~");
		
	}
}
