package com.s01.exception;

public class ExceptionMain01 {
	public static void main(String[] args) {
		int[] array = {10, 20, 30};
		/*
		 * �Ϻη� ���� �ε���(3)�� ȣ���ؼ� ���ܸ� �߻���Ŵ
		 * ���ܰ� �߻��ϸ� ���ܰ� �߻��� �������� ���α׷��� ���� ����
		 */
		
		for(int i = 0; i <= array.length; i++) {
			/*
			 * ���ܰ� �߻��ϰ� ���α׷��� ����
			 * ���ܰ� �߻��ϸ� ���� ������ ��� �ִ� ���� ��ü�� �����ǰ�
			 * ���� ������ �ֿܼ� ��µ�.
			 */
			
			System.out.println("arrat[" + i + "] : " + array[i]);
		}
		
		System.out.println("���α׷� ��~");
		
		
		
		
		
	}
}
