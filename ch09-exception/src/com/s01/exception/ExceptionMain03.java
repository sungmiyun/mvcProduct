package com.s01.exception;

public class ExceptionMain03 {
	public static void main(String[] args) {
		int var = 50;
		//���� catch�� ���
		//���ܰ� �߻��ϸ� ���� ��ü�� ���޵Ǵ� catch ������ �̵��ؼ� ���๮�� ����
		try {
						//String -> int
			int data = Integer.parseInt(args[0]);
			System.out.println(var/data);
			System.out.println("===========================");
			/*
			 * (����) ���� catch���� ����� ��
			 * Exception�� ���� ���� Ŭ������ ���ÿ� ����� ������ ���� ���� Ŭ������ ���� ����ϰ�,  
			 * ���� �ڿ� Exception�� ����ؾ� ���ۻ��� ������ �߻����� �ʴ´�.	
			 */
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է��� �����Ͱ� �����ϴ�.");
			
		}catch(NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
			
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e) { 
			System.out.println("������ ���ܴ� ���Է� ��");
		}	
		System.out.println("���α׷� ����.....");
	}
}